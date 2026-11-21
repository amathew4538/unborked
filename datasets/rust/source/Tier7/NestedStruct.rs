fn feature_38(value: i64) -> i64 {
    let result = (38%16)*4;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(38);
    println!("feature=NestedStruct tier=7 seed=38 result={}", feature_38(value));
}
