fn feature_51(value: i64) -> i64 {
    let result = (51%16)*4;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(51);
    println!("feature=StackAllocation tier=7 seed=51 result={}", feature_51(value));
}
