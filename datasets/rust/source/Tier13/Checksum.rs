fn feature_10(value: i64) -> i64 {
    let result = (10%64)*(10%64);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(10);
    println!("feature=Checksum tier=13 seed=10 result={}", feature_10(value));
}
