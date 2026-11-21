import os

fn feature(seed int, value int) int {
    result := seed + value + 70
    return result
}

fn main() {
    mut value := 70
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=Comparison tier=6 seed=70 result=' + feature(70, value).str())
}
