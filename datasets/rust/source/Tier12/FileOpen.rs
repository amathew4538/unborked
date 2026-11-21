fn feature_73(value: i64) -> i64 {
    let result = 73%1024;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(73);
    println!("feature=FileOpen tier=12 seed=73 result={}", feature_73(value));
}
