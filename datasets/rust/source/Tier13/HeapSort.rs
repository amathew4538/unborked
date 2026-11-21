fn feature_37(value: i64) -> i64 {
    let result = (37%64)*(37%64);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(37);
    println!("feature=HeapSort tier=13 seed=37 result={}", feature_37(value));
}
