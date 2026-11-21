fn feature_0(value: i64) -> i64 {
    let result = (0%16)*4;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(0);
    println!("feature=Endianness tier=7 seed=0 result={}", feature_0(value));
}
