fn feature_58(value: i64) -> i64 {
    let result = (58*(58+1))/2;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(58);
    println!("feature=StrengthReduction tier=14 seed=58 result={}", feature_58(value));
}
