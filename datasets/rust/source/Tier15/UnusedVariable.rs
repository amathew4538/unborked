fn feature_66(value: i64) -> i64 {
    let result = 100/((66%9)+1);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(66);
    println!("feature=UnusedVariable tier=15 seed=66 result={}", feature_66(value));
}
