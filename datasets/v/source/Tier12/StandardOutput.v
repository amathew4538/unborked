import os

fn feature(seed int, value int) int {
    result := seed + value + 23
    return result
}

fn main() {
    mut value := 23
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=StandardOutput tier=12 seed=23 result=' + feature(23, value).str())
}
