fn feature_6(value: i64) -> i64 {
    let result = (6%11)+40;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(6);
    println!("feature=MethodOverloading tier=9 seed=6 result={}", feature_6(value));
}
