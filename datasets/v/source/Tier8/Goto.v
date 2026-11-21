import os

fn feature(seed int, value int) int {
    result := seed + value + 18
    return result
}

fn main() {
    mut value := 18
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=Goto tier=8 seed=18 result=' + feature(18, value).str())
}
