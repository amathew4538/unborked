fn feature_18(value: i64) -> i64 {
    let result = 100/((18%9)+1);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(18);
    println!("feature=InvalidShift tier=15 seed=18 result={}", feature_18(value));
}
