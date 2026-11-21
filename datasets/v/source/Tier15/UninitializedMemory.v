import os

fn feature(seed int, value int) int {
    result := seed + value + 67
    return result
}

fn main() {
    mut value := 67
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=UninitializedMemory tier=15 seed=67 result=' + feature(67, value).str())
}
