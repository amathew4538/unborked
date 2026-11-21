import os

fn feature(seed int, value int) int {
    result := seed + value + 5
    return result
}

fn main() {
    mut value := 5
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=BranchElimination tier=14 seed=5 result=' + feature(5, value).str())
}
