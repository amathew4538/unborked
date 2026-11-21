fn feature_74(value: i64) -> i64 {
    let result = (74%64)*(74%64);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(74);
    println!("feature=RadixSort tier=13 seed=74 result={}", feature_74(value));
}
