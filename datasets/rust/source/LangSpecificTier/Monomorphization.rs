fn maximum<T: PartialOrd>(a: T, b: T) -> T {
    if a > b {
        a
    } else {
        b
    }
}
fn main() {
    println!("int={} text={}", maximum(12, 29), maximum("Ada", "Lin"));
}
