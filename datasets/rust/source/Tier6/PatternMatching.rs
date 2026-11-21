fn feature_65(value: i64) -> i64 {
    let result = 65*17+3;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(65);
    println!("feature=PatternMatching tier=6 seed=65 result={}", feature_65(value));
}
