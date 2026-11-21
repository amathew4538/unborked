import os

fn feature(seed int, value int) int {
    result := seed + value + 50
    return result
}

fn main() {
    mut value := 50
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=PositionIndependentExecutable tier=10 seed=50 result=' + feature(50, value).str())
}
