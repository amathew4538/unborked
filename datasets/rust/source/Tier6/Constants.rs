fn feature_27(value: i64) -> i64 {
    let result = 27*17+3;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(27);
    println!("feature=Constants tier=6 seed=27 result={}", feature_27(value));
}
