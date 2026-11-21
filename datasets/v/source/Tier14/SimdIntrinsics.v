import os

fn feature(seed int, value int) int {
    result := seed + value + 81
    return result
}

fn main() {
    mut value := 81
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=SimdIntrinsics tier=14 seed=81 result=' + feature(81, value).str())
}
