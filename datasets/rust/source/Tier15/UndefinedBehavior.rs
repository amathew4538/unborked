fn feature_37(value: i64) -> i64 {
    let result = 100/((37%9)+1);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(37);
    println!("feature=UndefinedBehavior tier=15 seed=37 result={}", feature_37(value));
}
