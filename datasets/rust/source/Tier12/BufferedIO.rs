use std::env;
use std::io::{self, Read};
fn main() {
    let mut data = String::new();
    let _ = io::stdin().read_to_string(&mut data);
    println!(
        "feature=BufferedIO args={:?} stdin_bytes={}",
        env::args().collect::<Vec<_>>(),
        data.len()
    );
}
