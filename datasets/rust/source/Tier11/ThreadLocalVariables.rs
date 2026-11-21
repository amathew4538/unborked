fn feature_0(value: i64) -> i64 {
    let result = 1+(0%8);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(0);
    println!("feature=ThreadLocalVariables tier=11 seed=0 result={}", feature_0(value));
}
