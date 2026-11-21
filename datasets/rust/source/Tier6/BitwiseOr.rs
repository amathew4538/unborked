fn feature_24(value: i64) -> i64 {
    let result = 24*17+3;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(24);
    println!("feature=BitwiseOr tier=6 seed=24 result={}", feature_24(value));
}
