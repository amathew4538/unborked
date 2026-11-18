fn main() {
    let mut grid = [[false; 5]; 5];
    grid[1][2] = true;
    grid[2][2] = true;
    grid[3][2] = true;

    let mut next = [[false; 5]; 5];
    for row in 0..5 {
        for column in 0..5 {
            let mut neighbours = 0;
            for dy in -1..=1 {
                for dx in -1..=1 {
                    if dx == 0 && dy == 0 { continue; }
                    let y = row as isize + dy;
                    let x = column as isize + dx;
                    if y >= 0 && y < 5 && x >= 0 && x < 5 {
                        neighbours += grid[y as usize][x as usize] as i32;
                    }
                }
            }
            next[row][column] = neighbours == 3 || (grid[row][column] && neighbours == 2);
        }
    }

    println!("generation: 1");
    for row in next {
        println!("{}", row.map(|cell| if cell { '#' } else { '.' }).iter().collect::<String>());
    }
}
