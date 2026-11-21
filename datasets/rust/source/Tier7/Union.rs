fn feature_62(value: i64) -> i64 {
    let result = (62%16)*4;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(62);
    println!("feature=Union tier=7 seed=62 result={}", feature_62(value));
}
