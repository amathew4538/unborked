fn feature_68(value: i64) -> i64 {
    let result = (68%16)*4;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(68);
    println!("feature=References tier=7 seed=68 result={}", feature_68(value));
}
