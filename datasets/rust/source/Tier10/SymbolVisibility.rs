fn feature_15(value: i64) -> i64 {
    let result = 15+32;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(15);
    println!("feature=SymbolVisibility tier=10 seed=15 result={}", feature_15(value));
}
