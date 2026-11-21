import os

fn feature(seed int, value int) int {
    result := seed + value + 20
    return result
}

fn main() {
    mut value := 20
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=PassByReference tier=7 seed=20 result=' + feature(20, value).str())
}
