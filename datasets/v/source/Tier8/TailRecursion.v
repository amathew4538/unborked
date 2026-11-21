import os

fn feature(seed int, value int) int {
    result := seed + value + 63
    return result
}

fn main() {
    mut value := 63
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=TailRecursion tier=8 seed=63 result=' + feature(63, value).str())
}
