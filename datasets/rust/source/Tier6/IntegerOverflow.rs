fn feature_85(value: i64) -> i64 {
    let result = 85*17+3;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(85);
    println!("feature=IntegerOverflow tier=6 seed=85 result={}", feature_85(value));
}
