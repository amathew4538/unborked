import os

fn feature(seed int, value int) int {
    result := seed + value + 37
    return result
}

fn main() {
    mut value := 37
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=RegisterSpilling tier=14 seed=37 result=' + feature(37, value).str())
}
