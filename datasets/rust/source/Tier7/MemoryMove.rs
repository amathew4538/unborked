fn feature_25(value: i64) -> i64 {
    let result = (25%16)*4;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(25);
    println!("feature=MemoryMove tier=7 seed=25 result={}", feature_25(value));
}
