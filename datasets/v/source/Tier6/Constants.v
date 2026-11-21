import os

fn feature(seed int, value int) int {
    result := seed + value + 27
    return result
}

fn main() {
    mut value := 27
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=Constants tier=6 seed=27 result=' + feature(27, value).str())
}
