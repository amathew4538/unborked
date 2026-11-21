fn feature_30(value: i64) -> i64 {
    let result = 30+((30%5)*7);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(30);
    println!("feature=FunctionPointer tier=8 seed=30 result={}", feature_30(value));
}
