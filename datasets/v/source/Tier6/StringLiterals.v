import os

fn feature(seed int, value int) int {
    result := seed + value + 45
    return result
}

fn main() {
    mut value := 45
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=StringLiterals tier=6 seed=45 result=' + feature(45, value).str())
}
