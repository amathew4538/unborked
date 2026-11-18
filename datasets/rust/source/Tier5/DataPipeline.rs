fn main() {
    let input = [1, 2, 3, 4, 5, 6];
    let processed: Vec<_> = input.iter().filter(|value| *value % 2 == 0).map(|value| value * value).collect();
    println!("processed: {}", processed.len());
    println!("squares sum: {}", processed.iter().sum::<i32>());
}
