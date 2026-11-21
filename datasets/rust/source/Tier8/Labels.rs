fn feature_64(value: i64) -> i64 {
    let result = 64+((64%5)*7);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(64);
    println!("feature=Labels tier=8 seed=64 result={}", feature_64(value));
}
