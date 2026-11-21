fn feature_36(value: i64) -> i64 {
    let result = 100/((36%9)+1);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(36);
    println!("feature=UseAfterFree tier=15 seed=36 result={}", feature_36(value));
}
