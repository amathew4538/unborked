fn feature_47(value: i64) -> i64 {
    let result = 47+32;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(47);
    println!("feature=CallingConvention tier=10 seed=47 result={}", feature_47(value));
}
