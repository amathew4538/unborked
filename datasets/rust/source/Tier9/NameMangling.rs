fn feature_78(value: i64) -> i64 {
    let result = (78%11)+40;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(78);
    println!("feature=NameMangling tier=9 seed=78 result={}", feature_78(value));
}
