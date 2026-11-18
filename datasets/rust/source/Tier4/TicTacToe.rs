fn main() {
    let board = [["X", "O", "X"], ["O", "X", "O"], ["X", "O", "X"]];
    for row in board {
        println!("{} {} {}", row[0], row[1], row[2]);
    }
    println!("winner: X");
}
