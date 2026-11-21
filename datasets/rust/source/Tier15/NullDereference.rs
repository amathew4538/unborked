fn feature_26(value: i64) -> i64 {
    let result = 100/((26%9)+1);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(26);
    println!("feature=NullDereference tier=15 seed=26 result={}", feature_26(value));
}
