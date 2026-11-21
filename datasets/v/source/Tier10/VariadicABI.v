import os

fn feature(seed int, value int) int {
    result := seed + value + 76
    return result
}

fn main() {
    mut value := 76
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=VariadicABI tier=10 seed=76 result=' + feature(76, value).str())
}
