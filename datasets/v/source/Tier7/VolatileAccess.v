import os

fn feature(seed int, value int) int {
    result := seed + value + 8
    return result
}

fn main() {
    mut value := 8
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=VolatileAccess tier=7 seed=8 result=' + feature(8, value).str())
}
