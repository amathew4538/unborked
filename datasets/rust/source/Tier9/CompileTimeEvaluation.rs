fn feature_83(value: i64) -> i64 {
    let result = (83%11)+40;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(83);
    println!("feature=CompileTimeEvaluation tier=9 seed=83 result={}", feature_83(value));
}
