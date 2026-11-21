fn feature_50(value: i64) -> i64 {
    let result = 50+32;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(50);
    println!("feature=PositionIndependentExecutable tier=10 seed=50 result={}", feature_50(value));
}
