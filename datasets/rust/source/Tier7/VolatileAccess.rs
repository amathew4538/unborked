fn feature_8(value: i64) -> i64 {
    let result = (8%16)*4;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(8);
    println!("feature=VolatileAccess tier=7 seed=8 result={}", feature_8(value));
}
