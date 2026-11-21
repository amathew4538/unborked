fn feature_96(value: i64) -> i64 {
    let result = 1+(96%8);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(96);
    println!("feature=DataRace tier=11 seed=96 result={}", feature_96(value));
}
