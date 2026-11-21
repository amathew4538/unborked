import os

fn feature(seed int, value int) int {
    result := seed + value + 88
    return result
}

fn main() {
    mut value := 88
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=PositionIndependentCode tier=10 seed=88 result=' + feature(88, value).str())
}
