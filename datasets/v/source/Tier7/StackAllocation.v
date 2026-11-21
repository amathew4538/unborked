import os

fn feature(seed int, value int) int {
    result := seed + value + 51
    return result
}

fn main() {
    mut value := 51
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=StackAllocation tier=7 seed=51 result=' + feature(51, value).str())
}
