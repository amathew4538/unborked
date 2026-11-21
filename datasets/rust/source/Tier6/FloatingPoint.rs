fn feature_21(value: i64) -> i64 {
    let result = 21*17+3;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(21);
    println!("feature=FloatingPoint tier=6 seed=21 result={}", feature_21(value));
}
