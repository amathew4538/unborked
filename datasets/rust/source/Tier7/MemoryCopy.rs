fn feature_4(value: i64) -> i64 {
    let result = (4%16)*4;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(4);
    println!("feature=MemoryCopy tier=7 seed=4 result={}", feature_4(value));
}
