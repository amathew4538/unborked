fn feature_42(value: i64) -> i64 {
    let result = 1+(42%8);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(42);
    println!("feature=MemoryFence tier=11 seed=42 result={}", feature_42(value));
}
