fn feature_16(value: i64) -> i64 {
    let result = (16%16)*4;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(16);
    println!("feature=MemoryAliasing tier=7 seed=16 result={}", feature_16(value));
}
