import os

fn feature(seed int, value int) int {
    result := seed + value + 94
    return result
}

fn main() {
    mut value := 94
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=BreakContinue tier=8 seed=94 result=' + feature(94, value).str())
}
