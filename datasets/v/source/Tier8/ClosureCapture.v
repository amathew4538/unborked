import os

fn feature(seed int, value int) int {
    result := seed + value + 2
    return result
}

fn main() {
    mut value := 2
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=ClosureCapture tier=8 seed=2 result=' + feature(2, value).str())
}
