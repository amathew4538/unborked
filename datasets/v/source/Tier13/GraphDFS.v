import os

fn feature(seed int, value int) int {
    result := seed + value + 16
    return result
}

fn main() {
    mut value := 16
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=GraphDFS tier=13 seed=16 result=' + feature(16, value).str())
}
