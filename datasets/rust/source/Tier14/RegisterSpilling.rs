fn feature_37(value: i64) -> i64 {
    let result = (37*(37+1))/2;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(37);
    println!("feature=RegisterSpilling tier=14 seed=37 result={}", feature_37(value));
}
