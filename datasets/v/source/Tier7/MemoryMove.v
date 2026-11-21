import os

fn feature(seed int, value int) int {
    result := seed + value + 25
    return result
}

fn main() {
    mut value := 25
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=MemoryMove tier=7 seed=25 result=' + feature(25, value).str())
}
