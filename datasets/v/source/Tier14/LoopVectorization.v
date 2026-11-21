import os

fn feature(seed int, value int) int {
    result := seed + value + 13
    return result
}

fn main() {
    mut value := 13
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=LoopVectorization tier=14 seed=13 result=' + feature(13, value).str())
}
