fn main() {
    let values = [2, 7, 13, 42, 64, 100];
    let index = values.binary_search(&42).expect("missing value");
    println!("index: {}", index);
}
