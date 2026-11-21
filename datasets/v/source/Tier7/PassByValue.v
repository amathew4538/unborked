import os

fn feature(seed int, value int) int {
    result := seed + value + 73
    return result
}

fn main() {
    mut value := 73
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=PassByValue tier=7 seed=73 result=' + feature(73, value).str())
}
