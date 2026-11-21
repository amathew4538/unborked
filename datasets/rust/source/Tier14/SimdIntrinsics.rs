fn feature_81(value: i64) -> i64 {
    let result = (81*(81+1))/2;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(81);
    println!("feature=SimdIntrinsics tier=14 seed=81 result={}", feature_81(value));
}
