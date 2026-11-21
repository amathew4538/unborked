fn feature_49(value: i64) -> i64 {
    let result = (49%16)*4;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(49);
    println!("feature=HeapAllocation tier=7 seed=49 result={}", feature_49(value));
}
