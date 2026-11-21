fn feature_29(value: i64) -> i64 {
    let result = 100/((29%9)+1);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(29);
    println!("feature=NestedScopes tier=15 seed=29 result={}", feature_29(value));
}
