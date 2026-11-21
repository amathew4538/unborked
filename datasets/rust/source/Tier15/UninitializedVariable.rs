fn feature_60(value: i64) -> i64 {
    let result = 100/((60%9)+1);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(60);
    println!("feature=UninitializedVariable tier=15 seed=60 result={}", feature_60(value));
}
