import os

fn feature(seed int, value int) int {
    result := seed + value + 52
    return result
}

fn main() {
    mut value := 52
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=AtomicCompareExchange tier=11 seed=52 result=' + feature(52, value).str())
}
