fn feature_71(value: i64) -> i64 {
    let result = 1+(71%8);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(71);
    println!("feature=ParallelLoop tier=11 seed=71 result={}", feature_71(value));
}
