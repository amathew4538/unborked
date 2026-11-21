fn feature_29(value: i64) -> i64 {
    let result = 29+((29%5)*7);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(29);
    println!("feature=Exception tier=8 seed=29 result={}", feature_29(value));
}
