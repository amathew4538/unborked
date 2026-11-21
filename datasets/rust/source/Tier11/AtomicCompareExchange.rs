fn feature_52(value: i64) -> i64 {
    let result = 1+(52%8);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(52);
    println!("feature=AtomicCompareExchange tier=11 seed=52 result={}", feature_52(value));
}
