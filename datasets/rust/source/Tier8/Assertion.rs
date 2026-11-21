fn feature_73(value: i64) -> i64 {
    let result = 73+((73%5)*7);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(73);
    println!("feature=Assertion tier=8 seed=73 result={}", feature_73(value));
}
