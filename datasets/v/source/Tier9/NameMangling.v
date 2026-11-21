import os

fn feature(seed int, value int) int {
    result := seed + value + 78
    return result
}

fn main() {
    mut value := 78
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=NameMangling tier=9 seed=78 result=' + feature(78, value).str())
}
