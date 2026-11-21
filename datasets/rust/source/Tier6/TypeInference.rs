fn feature_48(value: i64) -> i64 {
    let result = 48*17+3;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(48);
    println!("feature=TypeInference tier=6 seed=48 result={}", feature_48(value));
}
