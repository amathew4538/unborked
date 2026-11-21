import os

fn feature(seed int, value int) int {
    result := seed + value + 29
    return result
}

fn main() {
    mut value := 29
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=NestedScopes tier=15 seed=29 result=' + feature(29, value).str())
}
