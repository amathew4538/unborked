fn feature_3(value: i64) -> i64 {
    let result = 3*17+3;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(3);
    println!("feature=BitwiseAnd tier=6 seed=3 result={}", feature_3(value));
}
