import os

fn feature(seed int, value int) int {
    result := seed + value + 65
    return result
}

fn main() {
    mut value := 65
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=PatternMatching tier=6 seed=65 result=' + feature(65, value).str())
}
