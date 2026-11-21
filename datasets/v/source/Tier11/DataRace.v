import os

fn feature(seed int, value int) int {
    result := seed + value + 96
    return result
}

fn main() {
    mut value := 96
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=DataRace tier=11 seed=96 result=' + feature(96, value).str())
}
