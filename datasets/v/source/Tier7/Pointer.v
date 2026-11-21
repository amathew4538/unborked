import os

fn feature(seed int, value int) int {
    result := seed + value + 34
    return result
}

fn main() {
    mut value := 34
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=Pointer tier=7 seed=34 result=' + feature(34, value).str())
}
