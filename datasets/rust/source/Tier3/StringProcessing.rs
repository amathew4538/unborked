use std::io::{self, Read};
fn main() {
    let mut s = String::new();
    let _ = io::stdin().read_to_string(&mut s);
    let words = s.split_whitespace().count();
    let letters = s.chars().filter(|c| c.is_alphabetic()).count();
    let digits = s.chars().filter(|c| c.is_numeric()).count();
    println!("letters={letters} digits={digits} words={words}");
}
