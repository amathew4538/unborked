fn feature_85(value: i64) -> i64 {
    let result = (85%16)*4;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(85);
    println!("feature=MultidimensionalArray tier=7 seed=85 result={}", feature_85(value));
}
