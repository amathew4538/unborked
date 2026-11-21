fn main() {
    let mut g = [[0; 5]; 5];
    g[1][2] = 1;
    g[2][2] = 1;
    g[3][2] = 1;
    for generation in 1..=5 {
        let mut n = [[0; 5]; 5];
        for r in 0..5 {
            for c in 0..5 {
                let mut x = 0;
                for dr in -1i32..=1 {
                    for dc in -1i32..=1 {
                        if dr == 0 && dc == 0 {
                            continue;
                        }
                        let y = r as i32 + dr;
                        let z = c as i32 + dc;
                        if y >= 0 && y < 5 && z >= 0 && z < 5 {
                            x += g[y as usize][z as usize]
                        }
                    }
                }
                n[r][c] = if x == 3 || (g[r][c] == 1 && x == 2) {
                    1
                } else {
                    0
                }
            }
        }
        g = n;
        println!("generation: {generation}");
        for row in g {
            println!(
                "{}",
                row.iter()
                    .map(|x| if *x == 1 { '#' } else { '.' })
                    .collect::<String>()
            )
        }
    }
}
