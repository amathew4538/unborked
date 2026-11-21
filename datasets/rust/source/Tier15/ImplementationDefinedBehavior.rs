fn feature_7(value: i64) -> i64 {
    let result = 100/((7%9)+1);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(7);
    println!("feature=ImplementationDefinedBehavior tier=15 seed=7 result={}", feature_7(value));
}
