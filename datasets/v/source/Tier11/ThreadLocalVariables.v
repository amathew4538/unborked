import os

fn feature(seed int, value int) int {
    result := seed + value + 0
    return result
}

fn main() {
    mut value := 0
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=ThreadLocalVariables tier=11 seed=0 result=' + feature(0, value).str())
}
