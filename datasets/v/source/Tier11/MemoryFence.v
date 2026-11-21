import os

fn feature(seed int, value int) int {
    result := seed + value + 42
    return result
}

fn main() {
    mut value := 42
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=MemoryFence tier=11 seed=42 result=' + feature(42, value).str())
}
