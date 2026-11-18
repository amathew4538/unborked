fn main() {
    let left = [[1, 2, 3], [4, 5, 6]];
    let right = [[7, 8], [9, 10], [11, 12]];

    for row in 0..2 {
        for column in 0..2 {
            let value = (0..3).map(|inner| left[row][inner] * right[inner][column]).sum::<i32>();
            print!("{}{}", value, if column == 1 { "\n" } else { " " });
        }
    }
}
