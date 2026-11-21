fn feature_41(value: i64) -> i64 {
    let result = (41*(41+1))/2;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(41);
    println!("feature=InstructionSelection tier=14 seed=41 result={}", feature_41(value));
}
