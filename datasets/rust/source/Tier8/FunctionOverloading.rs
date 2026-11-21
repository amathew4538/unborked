fn feature_20(value: i64) -> i64 {
    let result = 20+((20%5)*7);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(20);
    println!("feature=FunctionOverloading tier=8 seed=20 result={}", feature_20(value));
}
