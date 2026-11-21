fn feature_45(value: i64) -> i64 {
    let result = (45%64)*(45%64);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(45);
    println!("feature=Regex tier=13 seed=45 result={}", feature_45(value));
}
