import os

fn feature(seed int, value int) int {
    result := seed + value + 43
    return result
}

fn main() {
    mut value := 43
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=FileWrite tier=12 seed=43 result=' + feature(43, value).str())
}
