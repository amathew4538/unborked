fn feature_14(value: i64) -> i64 {
    let result = 1+(14%8);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(14);
    println!("feature=Mutex tier=11 seed=14 result={}", feature_14(value));
}
