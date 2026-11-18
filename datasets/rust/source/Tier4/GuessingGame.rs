fn main() {
    let target = 5;
    for (turn, guess) in [7, 3, 5].iter().enumerate() {
        println!("guess {}: {}", turn + 1, guess);
        if *guess == target {
            println!("found: {}", target);
            break;
        }
    }
}
