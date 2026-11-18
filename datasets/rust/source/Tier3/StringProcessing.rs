fn main() {
    let input = "Hello World!";
    println!("upper: {}", input.to_uppercase());
    println!("reverse: {}", input.chars().rev().collect::<String>());
    println!("words: {}", input.split_whitespace().count());
}
