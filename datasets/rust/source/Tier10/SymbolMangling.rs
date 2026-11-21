fn feature_38(value: i64) -> i64 {
    let result = 38+32;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(38);
    println!("feature=SymbolMangling tier=10 seed=38 result={}", feature_38(value));
}
