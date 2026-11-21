fn classify(n: i32) -> &'static str {
    if n < 0 {
        "negative"
    } else if n > 0 {
        "positive"
    } else {
        "zero"
    }
}

fn main() {
    println!("{}", classify(-1));
    println!("{}", classify(0));
    println!("{}", classify(1));
}
