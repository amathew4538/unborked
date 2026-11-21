fn feature_11(value: i64) -> i64 {
    let result = 11%1024;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(11);
    println!("feature=FileRead tier=12 seed=11 result={}", feature_11(value));
}
