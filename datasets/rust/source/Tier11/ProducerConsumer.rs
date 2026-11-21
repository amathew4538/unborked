fn feature_75(value: i64) -> i64 {
    let result = 1+(75%8);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(75);
    println!("feature=ProducerConsumer tier=11 seed=75 result={}", feature_75(value));
}
