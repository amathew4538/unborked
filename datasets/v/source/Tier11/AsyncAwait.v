import os

fn feature(seed int, value int) int {
    result := seed + value + 71
    return result
}

fn main() {
    mut value := 71
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=AsyncAwait tier=11 seed=71 result=' + feature(71, value).str())
}
