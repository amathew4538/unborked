import os

fn feature(seed int, value int) int {
    result := seed + value + 46
    return result
}

fn main() {
    mut value := 46
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=CommandLineArguments tier=12 seed=46 result=' + feature(46, value).str())
}
