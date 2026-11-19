import os

fn apply_feature(value: int) int {
    return value * value + 3
}

fn main() {
    mut value := 42
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=FloatingPoint value=' + value.str() + ' result=' + apply_feature(value).str())
}
