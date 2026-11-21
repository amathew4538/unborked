import os

fn feature(seed int, value int) int {
    result := seed + value + 47
    return result
}

fn main() {
    mut value := 47
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=BoundsCheckElimination tier=14 seed=47 result=' + feature(47, value).str())
}
