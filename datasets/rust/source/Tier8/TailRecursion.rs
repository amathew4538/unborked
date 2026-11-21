fn feature_63(value: i64) -> i64 {
    let result = 63+((63%5)*7);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(63);
    println!("feature=TailRecursion tier=8 seed=63 result={}", feature_63(value));
}
