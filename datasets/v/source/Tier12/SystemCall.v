import os

fn feature(seed int, value int) int {
    result := seed + value + 61
    return result
}

fn main() {
    mut value := 61
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=SystemCall tier=12 seed=61 result=' + feature(61, value).str())
}
