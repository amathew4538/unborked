fn feature_94(value: i64) -> i64 {
    let result = 100/((94%9)+1);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(94);
    println!("feature=OutOfBoundsAccess tier=15 seed=94 result={}", feature_94(value));
}
