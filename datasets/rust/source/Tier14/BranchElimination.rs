fn feature_5(value: i64) -> i64 {
    let result = (5*(5+1))/2;
    result + value
}

fn main() {
    let value = std::env::args().nth(1).and_then(|v| v.parse::<i64>().ok()).unwrap_or(5);
    println!("feature=BranchElimination tier=14 seed=5 result={}", feature_5(value));
}
