fn feature_60(value: i64) -> i64 {
    let result = 60%1024;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(60);
    println!("feature=Pipe tier=12 seed=60 result={}", feature_60(value));
}
