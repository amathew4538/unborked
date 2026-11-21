fn feature_67(value: i64) -> i64 {
    let result = 67*17+3;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(67);
    println!("feature=IntegerUnderflow tier=6 seed=67 result={}", feature_67(value));
}
