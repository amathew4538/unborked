import os

fn feature(seed int, value int) int {
    result := seed + value + 10
    return result
}

fn main() {
    mut value := 10
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=Checksum tier=13 seed=10 result=' + feature(10, value).str())
}
