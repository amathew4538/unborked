import os

fn feature(seed int, value int) int {
    result := seed + value + 14
    return result
}

fn main() {
    mut value := 14
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=ThreadCreate tier=11 seed=14 result=' + feature(14, value).str())
}
