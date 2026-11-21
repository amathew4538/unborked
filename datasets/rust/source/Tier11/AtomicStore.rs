fn feature_57(value: i64) -> i64 {
    let result = 1+(57%8);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(57);
    println!("feature=AtomicStore tier=11 seed=57 result={}", feature_57(value));
}
