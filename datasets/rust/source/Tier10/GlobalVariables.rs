fn feature_66(value: i64) -> i64 {
    let result = 66+32;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(66);
    println!("feature=GlobalVariables tier=10 seed=66 result={}", feature_66(value));
}
