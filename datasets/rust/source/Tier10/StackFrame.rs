fn feature_90(value: i64) -> i64 {
    let result = 90+32;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(90);
    println!("feature=StackFrame tier=10 seed=90 result={}", feature_90(value));
}
