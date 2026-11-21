import os

fn feature(seed int, value int) int {
    result := seed + value + 30
    return result
}

fn main() {
    mut value := 30
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=StaticMethods tier=9 seed=30 result=' + feature(30, value).str())
}
