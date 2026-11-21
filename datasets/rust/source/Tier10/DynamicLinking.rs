fn feature_91(value: i64) -> i64 {
    let result = 91+32;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(91);
    println!("feature=DynamicLinking tier=10 seed=91 result={}", feature_91(value));
}
