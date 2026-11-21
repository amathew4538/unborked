fn feature_28(value: i64) -> i64 {
    let result = 28*17+3;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(28);
    println!("feature=ImplicitConversion tier=6 seed=28 result={}", feature_28(value));
}
