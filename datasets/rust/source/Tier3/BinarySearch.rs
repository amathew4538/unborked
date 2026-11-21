use std::env;
fn main() {
    let v = [2, 7, 13, 42, 64, 100];
    let target = env::args()
        .nth(1)
        .and_then(|x| x.parse().ok())
        .unwrap_or(42);
    match v.binary_search(&target) {
        Ok(i) => println!("found {target} at {i}"),
        Err(_) => println!("not found: {target}"),
    }
}
