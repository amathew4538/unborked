fn feature_40(value: i64) -> i64 {
    let result = 40%1024;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(40);
    println!("feature=FileMetadata tier=12 seed=40 result={}", feature_40(value));
}
