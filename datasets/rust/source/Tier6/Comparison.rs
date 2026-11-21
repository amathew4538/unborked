fn feature_70(value: i64) -> i64 {
    let result = 70*17+3;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(70);
    println!("feature=Comparison tier=6 seed=70 result={}", feature_70(value));
}
