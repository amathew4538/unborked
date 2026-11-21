import os

fn feature(seed int, value int) int {
    result := seed + value + 6
    return result
}

fn main() {
    mut value := 6
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=MethodOverloading tier=9 seed=6 result=' + feature(6, value).str())
}
