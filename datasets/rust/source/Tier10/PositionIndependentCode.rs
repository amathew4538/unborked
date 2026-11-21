fn feature_88(value: i64) -> i64 {
    let result = 88+32;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(88);
    println!("feature=PositionIndependentCode tier=10 seed=88 result={}", feature_88(value));
}
