import os

fn feature(seed int, value int) int {
    result := seed + value + 49
    return result
}

fn main() {
    mut value := 49
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=StandardError tier=12 seed=49 result=' + feature(49, value).str())
}
