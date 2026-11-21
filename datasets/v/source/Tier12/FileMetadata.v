import os

fn feature(seed int, value int) int {
    result := seed + value + 40
    return result
}

fn main() {
    mut value := 40
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=FileMetadata tier=12 seed=40 result=' + feature(40, value).str())
}
