import os

fn feature(seed int, value int) int {
    result := seed + value + 44
    return result
}

fn main() {
    mut value := 44
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=ErrorPropagation tier=8 seed=44 result=' + feature(44, value).str())
}
