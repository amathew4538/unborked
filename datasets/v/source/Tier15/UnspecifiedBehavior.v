import os

fn feature(seed int, value int) int {
    result := seed + value + 62
    return result
}

fn main() {
    mut value := 62
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=UnspecifiedBehavior tier=15 seed=62 result=' + feature(62, value).str())
}
