fn feature_76(value: i64) -> i64 {
    let result = 76+32;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(76);
    println!("feature=VariadicABI tier=10 seed=76 result={}", feature_76(value));
}
