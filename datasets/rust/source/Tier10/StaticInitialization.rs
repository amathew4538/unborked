fn feature_24(value: i64) -> i64 {
    let result = 24+32;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(24);
    println!("feature=StaticInitialization tier=10 seed=24 result={}", feature_24(value));
}
