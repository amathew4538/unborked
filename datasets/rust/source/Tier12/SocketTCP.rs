fn feature_1(value: i64) -> i64 {
    let result = 1%1024;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(1);
    println!("feature=SocketTCP tier=12 seed=1 result={}", feature_1(value));
}
