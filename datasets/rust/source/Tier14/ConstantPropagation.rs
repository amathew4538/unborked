fn feature_75(value: i64) -> i64 {
    let result = (75*(75+1))/2;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(75);
    println!("feature=ConstantPropagation tier=14 seed=75 result={}", feature_75(value));
}
