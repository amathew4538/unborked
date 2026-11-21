import os

fn feature(seed int, value int) int {
    result := seed + value + 60
    return result
}

fn main() {
    mut value := 60
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=UninitializedVariable tier=15 seed=60 result=' + feature(60, value).str())
}
