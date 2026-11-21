import os

fn feature(seed int, value int) int {
    result := seed + value + 28
    return result
}

fn main() {
    mut value := 28
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=ConstantExpression tier=15 seed=28 result=' + feature(28, value).str())
}
