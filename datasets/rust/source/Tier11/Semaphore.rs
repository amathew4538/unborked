fn feature_29(value: i64) -> i64 {
    let result = 1+(29%8);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(29);
    println!("feature=Semaphore tier=11 seed=29 result={}", feature_29(value));
}
