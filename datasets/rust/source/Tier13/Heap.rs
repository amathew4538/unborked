fn feature_43(value: i64) -> i64 {
    let result = (43%64)*(43%64);
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(43);
    println!("feature=Heap tier=13 seed=43 result={}", feature_43(value));
}
