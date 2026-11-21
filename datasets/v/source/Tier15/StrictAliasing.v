import os

fn feature(seed int, value int) int {
    result := seed + value + 35
    return result
}

fn main() {
    mut value := 35
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=StrictAliasing tier=15 seed=35 result=' + feature(35, value).str())
}
