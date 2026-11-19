# Unborked

## ***Is your program borked? Unbork it with Unborked AI!***

A decompilation AI dedicated to as many compiled languages we can shove in!

The Tier 3-5 dataset sources include practical utility and application examples:
text and file processing, sorting and search, calculators, games, caches,
state machines, data pipelines, and cellular automata. Programs accept
command-line arguments or standard input where appropriate.

## Dataset tiers

`Tier6` through `Tier15` cover numeric types, memory layout, control flow,
object abstractions, ABI/linking, concurrency, OS I/O, data structures,
compiler optimization, and edge behavior. Run
`python3 scripts/build_dataset.py --list-tiers` to inspect the full catalog.

Native C and C++ examples, plus Rust and Go examples, cover the major
memory, ABI, concurrency, and optimization constructs. Java and C#/Mono C#
cover the JVM/CLR feature catalog. Constructs that do not exist in a language
are omitted rather than emulated, and language-specific features are listed
by `LANG_SPECIFIC_SCRIPTS` in `scripts/build_dataset.py`.

Each successful build records a `.build.json` metadata file alongside the
binary with source, tier, script, optimization, target architecture, and
binary/assembly artifact paths.

## Additional language coverage

Tier 6-15 sources are present for Clojure, D, Haskell, Kotlin, Nim,
Objective-C, Scala, Swift, and V. Their programs demonstrate argument parsing,
numeric transformations, ownership-safe heap-style operations, functional
callbacks, threading concepts, I/O, sorting, and checked error handling using
constructs native to each language. Missing toolchain support in a local
environment is reported by `build_dataset.py`; it does not remove the source
examples or mark them as compiled artifacts.

## Language-specific tier

Language-only features are kept outside `SCRIPTS` in `LANG_SPECIFIC_SCRIPTS`.
They are compiled from `datasets/<language>/source/LangSpecificTier/` and
retained in matching binary and assembly directories. This separation keeps
the cross-language catalog from implying that unsupported constructs exist in
every language.
