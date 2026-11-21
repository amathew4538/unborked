use std::io::{self, Read};
fn main() {
    let mut s = String::new();
    let _ = io::stdin().read_to_string(&mut s);
    let mut v: Vec<i64> = s
        .split_whitespace()
        .filter_map(|x| x.parse().ok())
        .collect();
    if v.is_empty() {
        v = vec![42, 7, 13, 2, 64, 1]
    }
    v.sort();
    println!("{:?}", v);
}
