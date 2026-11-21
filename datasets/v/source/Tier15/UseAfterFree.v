import os

fn feature(seed int, value int) int {
    result := seed + value + 36
    return result
}

fn main() {
    mut value := 36
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=UseAfterFree tier=15 seed=36 result=' + feature(36, value).str())
}
