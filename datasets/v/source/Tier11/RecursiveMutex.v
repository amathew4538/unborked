import os

fn feature(seed int, value int) int {
    result := seed + value + 87
    return result
}

fn main() {
    mut value := 87
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=RecursiveMutex tier=11 seed=87 result=' + feature(87, value).str())
}
