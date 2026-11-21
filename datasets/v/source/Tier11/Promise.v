import os

fn feature(seed int, value int) int {
    result := seed + value + 89
    return result
}

fn main() {
    mut value := 89
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=Promise tier=11 seed=89 result=' + feature(89, value).str())
}
