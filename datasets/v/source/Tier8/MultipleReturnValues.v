import os

fn feature(seed int, value int) int {
    result := seed + value + 3
    return result
}

fn main() {
    mut value := 3
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=MultipleReturnValues tier=8 seed=3 result=' + feature(3, value).str())
}
