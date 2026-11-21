fn feature_95(value: i64) -> i64 {
    let result = (95%16)*4;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(95);
    println!("feature=ArrayLayout tier=7 seed=95 result={}", feature_95(value));
}
