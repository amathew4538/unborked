fn feature_31(value: i64) -> i64 {
    let result = (31%64)*(31%64);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(31);
    println!("feature=AvlTree tier=13 seed=31 result={}", feature_31(value));
}
