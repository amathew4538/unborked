fn feature_39(value: i64) -> i64 {
    let result = (39%64)*(39%64);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(39);
    println!("feature=QuickSort tier=13 seed=39 result={}", feature_39(value));
}
