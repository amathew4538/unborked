fn feature_34(value: i64) -> i64 {
    let result = (34%16)*4;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(34);
    println!("feature=Pointer tier=7 seed=34 result={}", feature_34(value));
}
