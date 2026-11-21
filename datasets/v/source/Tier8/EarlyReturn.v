import os

fn feature(seed int, value int) int {
    result := seed + value + 91
    return result
}

fn main() {
    mut value := 91
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=EarlyReturn tier=8 seed=91 result=' + feature(91, value).str())
}
