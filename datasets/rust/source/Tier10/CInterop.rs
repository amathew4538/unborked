fn feature_86(value: i64) -> i64 {
    let result = 86+32;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(86);
    println!("feature=CInterop tier=10 seed=86 result={}", feature_86(value));
}
