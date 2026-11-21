import os

fn feature(seed int, value int) int {
    result := seed + value + 24
    return result
}

fn main() {
    mut value := 24
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=BitwiseOr tier=6 seed=24 result=' + feature(24, value).str())
}
