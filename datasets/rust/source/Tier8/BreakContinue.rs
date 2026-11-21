fn feature_94(value: i64) -> i64 {
    let result = 94+((94%5)*7);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(94);
    println!("feature=BreakContinue tier=8 seed=94 result={}", feature_94(value));
}
