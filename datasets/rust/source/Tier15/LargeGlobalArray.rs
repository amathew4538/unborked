fn feature_17(value: i64) -> i64 {
    let result = 100/((17%9)+1);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(17);
    println!("feature=LargeGlobalArray tier=15 seed=17 result={}", feature_17(value));
}
