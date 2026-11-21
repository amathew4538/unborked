import os

fn feature(seed int, value int) int {
    result := seed + value + 77
    return result
}

fn main() {
    mut value := 77
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=SwitchCase tier=6 seed=77 result=' + feature(77, value).str())
}
