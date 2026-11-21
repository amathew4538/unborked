import os

fn feature(seed int, value int) int {
    result := seed + value + 38
    return result
}

fn main() {
    mut value := 38
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=NestedStruct tier=7 seed=38 result=' + feature(38, value).str())
}
