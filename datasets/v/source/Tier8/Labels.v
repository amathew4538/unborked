import os

fn feature(seed int, value int) int {
    result := seed + value + 64
    return result
}

fn main() {
    mut value := 64
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=Labels tier=8 seed=64 result=' + feature(64, value).str())
}
