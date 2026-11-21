import os

fn feature(seed int, value int) int {
    result := seed + value + 74
    return result
}

fn main() {
    mut value := 74
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=RadixSort tier=13 seed=74 result=' + feature(74, value).str())
}
