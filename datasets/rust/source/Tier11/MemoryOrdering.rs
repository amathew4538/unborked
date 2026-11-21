fn feature_49(value: i64) -> i64 {
    let result = 1+(49%8);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(49);
    println!("feature=MemoryOrdering tier=11 seed=49 result={}", feature_49(value));
}
