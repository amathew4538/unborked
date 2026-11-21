import os

fn feature(seed int, value int) int {
    result := seed + value + 83
    return result
}

fn main() {
    mut value := 83
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=CompileTimeEvaluation tier=9 seed=83 result=' + feature(83, value).str())
}
