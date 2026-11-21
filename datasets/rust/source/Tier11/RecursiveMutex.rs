fn feature_87(value: i64) -> i64 {
    let result = 1+(87%8);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(87);
    println!("feature=RecursiveMutex tier=11 seed=87 result={}", feature_87(value));
}
