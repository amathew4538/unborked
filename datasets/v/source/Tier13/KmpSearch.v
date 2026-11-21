import os

fn feature(seed int, value int) int {
    result := seed + value + 15
    return result
}

fn main() {
    mut value := 15
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=KmpSearch tier=13 seed=15 result=' + feature(15, value).str())
}
