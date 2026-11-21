import os

fn feature(seed int, value int) int {
    result := seed + value + 95
    return result
}

fn main() {
    mut value := 95
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=ArrayLayout tier=7 seed=95 result=' + feature(95, value).str())
}
