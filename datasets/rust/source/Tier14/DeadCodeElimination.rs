fn feature_32(value: i64) -> i64 {
    let result = (32*(32+1))/2;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(32);
    println!("feature=DeadCodeElimination tier=14 seed=32 result={}", feature_32(value));
}
