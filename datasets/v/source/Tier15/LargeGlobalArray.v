import os

fn feature(seed int, value int) int {
    result := seed + value + 17
    return result
}

fn main() {
    mut value := 17
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=LargeGlobalArray tier=15 seed=17 result=' + feature(17, value).str())
}
