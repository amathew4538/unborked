fn feature_59(value: i64) -> i64 {
    let result = (59*(59+1))/2;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(59);
    println!("feature=TailCallOptimization tier=14 seed=59 result={}", feature_59(value));
}
