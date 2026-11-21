import os

fn feature(seed int, value int) int {
    result := seed + value + 66
    return result
}

fn main() {
    mut value := 66
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=RegisterPressure tier=14 seed=66 result=' + feature(66, value).str())
}
