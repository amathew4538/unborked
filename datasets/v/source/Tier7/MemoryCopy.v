import os

fn feature(seed int, value int) int {
    result := seed + value + 4
    return result
}

fn main() {
    mut value := 4
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=MemoryCopy tier=7 seed=4 result=' + feature(4, value).str())
}
