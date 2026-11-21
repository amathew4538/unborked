import os

fn feature(seed int, value int) int {
    result := seed + value + 85
    return result
}

fn main() {
    mut value := 85
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=Struct tier=7 seed=85 result=' + feature(85, value).str())
}
