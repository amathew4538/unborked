fn feature_2(value: i64) -> i64 {
    let result = 2+((2%5)*7);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(2);
    println!("feature=ClosureCapture tier=8 seed=2 result={}", feature_2(value));
}
