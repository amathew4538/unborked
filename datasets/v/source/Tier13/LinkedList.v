import os

fn feature(seed int, value int) int {
    result := seed + value + 90
    return result
}

fn main() {
    mut value := 90
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=LinkedList tier=13 seed=90 result=' + feature(90, value).str())
}
