import os

fn feature(seed int, value int) int {
    result := seed + value + 21
    return result
}

fn main() {
    mut value := 21
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=FloatingPoint tier=6 seed=21 result=' + feature(21, value).str())
}
