import os

fn feature(seed int, value int) int {
    result := seed + value + 86
    return result
}

fn main() {
    mut value := 86
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=StackArguments tier=10 seed=86 result=' + feature(86, value).str())
}
