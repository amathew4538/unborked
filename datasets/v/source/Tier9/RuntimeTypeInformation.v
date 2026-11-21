import os

fn feature(seed int, value int) int {
    result := seed + value + 93
    return result
}

fn main() {
    mut value := 93
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=RuntimeTypeInformation tier=9 seed=93 result=' + feature(93, value).str())
}
