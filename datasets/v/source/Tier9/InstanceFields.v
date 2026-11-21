import os

fn feature(seed int, value int) int {
    result := seed + value + 75
    return result
}

fn main() {
    mut value := 75
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=InstanceFields tier=9 seed=75 result=' + feature(75, value).str())
}
