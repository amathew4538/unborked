fn feature_23(value: i64) -> i64 {
    let result = 23%1024;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(23);
    println!("feature=StandardOutput tier=12 seed=23 result={}", feature_23(value));
}
