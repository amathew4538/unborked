use std::env;
fn main() {
    let input = env::args().nth(1).unwrap_or_else(|| "42".into());
    let value: i64 = input.parse().unwrap_or(42);
    println!(
        "feature=SignedUnsigned value={} bits={:b}",
        value, value as u64
    );
}
