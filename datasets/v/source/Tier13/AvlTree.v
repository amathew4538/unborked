import os

fn feature(seed int, value int) int {
    result := seed + value + 31
    return result
}

fn main() {
    mut value := 31
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=AvlTree tier=13 seed=31 result=' + feature(31, value).str())
}
