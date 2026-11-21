fn feature_44(value: i64) -> i64 {
    let result = (44%64)*(44%64);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(44);
    println!("feature=Serialization tier=13 seed=44 result={}", feature_44(value));
}
