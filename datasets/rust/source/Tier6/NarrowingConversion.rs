fn feature_93(value: i64) -> i64 {
    let result = 93*17+3;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(93);
    println!("feature=NarrowingConversion tier=6 seed=93 result={}", feature_93(value));
}
