"""
Handles pretraining for lang detection from asm and bin

Current Parameter Count: 469,256
"""

from pathlib import Path
import random

from build_dataset import SCRIPTS
import torch
from torch.utils.data import ConcatDataset, Dataset
from transformers import ModernBertConfig, ModernBertForMaskedLM

ROOT_DIR = Path(__file__).resolve().parent.parent

MAX_LEN = 4096
PAD_ID = 256
CLS_ID = 257
SEP_ID = 258


class BinaryByteDataset(Dataset):
    """
    The file dataset containing the ASM (.s, .il, or .javap) files
    """

    def __init__(
        self,
        datasets_root: Path,
        subfolder: str,
        extensions: tuple,
        max_len: int = 4096,
    ):
        self.max_len = max_len
        self.file_paths = []

        for lang_dir in Path(datasets_root).iterdir():
            target_base = lang_dir / subfolder
            if not target_base.is_dir():
                continue

            for tier in SCRIPTS:
                target_dir = target_base / tier
                if not target_dir.is_dir():
                    continue
                for p in target_dir.rglob("*"):
                    if p.is_file() and p.suffix in extensions:
                        self.file_paths.append(p)

    def __len__(self):
        return len(self.file_paths)

    def __getitem__(self, idx):
        file_path = self.file_paths[idx]
        content = b""

        try:
            with open(file_path, "rb") as f:
                content = f.read()
        except OSError as e:
            print(f"Error reading {file_path}: {e}")

        # Reserve 2 slots for [CLS] and [SEP]
        chunk_limit = self.max_len - 2

        # Randomly sample a window if the binary/asm file is larger than max_len
        if len(content) > chunk_limit:
            start = random.randint(0, len(content) - chunk_limit)
            content = content[start : start + chunk_limit]

        # Convert raw bytes (0-255) to list of ints and wrap with [CLS] and [SEP]
        input_ids = [CLS_ID] + list(content) + [SEP_ID]

        return {"input_ids": torch.tensor(input_ids, dtype=torch.long)}


if __name__ == "__main__":
    asm_dataset = BinaryByteDataset(
        datasets_root=ROOT_DIR / "datasets",
        subfolder="asm",
        extensions=(".s", ".il", ".javap"),
        max_len=MAX_LEN,
    )
    bin_dataset = BinaryByteDataset(
        datasets_root=ROOT_DIR / "datasets",
        subfolder="bin",
        extensions=("", ".jar", ".dll", ".exe"),
        max_len=MAX_LEN,
    )

    train_dataset: Dataset = ConcatDataset([asm_dataset, bin_dataset])
    print(f"Loaded {len(asm_dataset)} ASM files and {len(bin_dataset)} BIN files.")

    config = ModernBertConfig( # pylint: disable=unexpected-keyword-arg
        vocab_size=264,
        hidden_size=128,
        intermediate_size=192,
        num_hidden_layers=3,
        num_attention_heads=4,
        max_position_embeddings=MAX_LEN,
        local_attention=128,
        layer_types=["full_attention", "sliding_attention", "sliding_attention"],
        pad_token_id=PAD_ID,
        cls_token_id=CLS_ID,
        sep_token_id=SEP_ID,
        bos_token_id=CLS_ID,
        eos_token_id=SEP_ID,
    )

    model = ModernBertForMaskedLM(config)
    print(f"Model parameters: {model.num_parameters():,}")
