fn feature_61(value: i64) -> i64 {
    let result = (61%64)*(61%64);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(61);
    println!("feature=Trie tier=13 seed=61 result={}", feature_61(value));
}
