fn feature_35(value: i64) -> i64 {
    let result = 35+((35%5)*7);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(35);
    println!("feature=Generator tier=8 seed=35 result={}", feature_35(value));
}
