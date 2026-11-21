fn feature_18(value: i64) -> i64 {
    let result = 18+((18%5)*7);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(18);
    println!("feature=Goto tier=8 seed=18 result={}", feature_18(value));
}
