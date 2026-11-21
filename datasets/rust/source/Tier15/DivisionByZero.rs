fn feature_92(value: i64) -> i64 {
    let result = 100/((92%9)+1);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(92);
    println!("feature=DivisionByZero tier=15 seed=92 result={}", feature_92(value));
}
