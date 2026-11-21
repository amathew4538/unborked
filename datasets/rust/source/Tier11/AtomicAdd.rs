fn feature_72(value: i64) -> i64 {
    let result = 1+(72%8);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(72);
    println!("feature=AtomicAdd tier=11 seed=72 result={}", feature_72(value));
}
