import os

fn feature(seed int, value int) int {
    result := seed + value + 9
    return result
}

fn main() {
    mut value := 9
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=SignedUnsigned tier=6 seed=9 result=' + feature(9, value).str())
}
