import os

fn feature(seed int, value int) int {
    result := seed + value + 41
    return result
}

fn main() {
    mut value := 41
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=InstructionSelection tier=14 seed=41 result=' + feature(41, value).str())
}
