import os

fn feature(seed int, value int) int {
    result := seed + value + 1
    return result
}

fn main() {
    mut value := 1
    args := os.args
    if args.len > 1 { value = args[1].int() }
    println('feature=SocketTCP tier=12 seed=1 result=' + feature(1, value).str())
}
