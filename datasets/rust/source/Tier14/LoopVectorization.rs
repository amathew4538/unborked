fn feature_13(value: i64) -> i64 {
    let result = (13*(13+1))/2;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(13);
    println!("feature=LoopVectorization tier=14 seed=13 result={}", feature_13(value));
}
