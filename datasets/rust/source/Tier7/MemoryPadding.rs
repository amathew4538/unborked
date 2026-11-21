fn feature_84(value: i64) -> i64 {
    let result = (84%16)*4;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(84);
    println!("feature=MemoryPadding tier=7 seed=84 result={}", feature_84(value));
}
