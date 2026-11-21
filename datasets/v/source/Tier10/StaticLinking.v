import os

fn feature(seed int, value int) int {
    result := seed + value + 26
    return result
}

fn main() {
    mut value := 26
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=StaticLinking tier=10 seed=26 result=' + feature(26, value).str())
}
