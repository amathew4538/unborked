import os

fn feature(seed int, value int) int {
    result := seed + value + 32
    return result
}

fn main() {
    mut value := 32
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=DeadCodeElimination tier=14 seed=32 result=' + feature(32, value).str())
}
