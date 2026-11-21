fn main() {
    let mut b = [' '; 9];
    for turn in 0..9 {
        let p = if turn % 2 == 0 { 'X' } else { 'O' };
        let m = if p == 'X' {
            4
        } else {
            (0..9).find(|&i| b[i] == ' ').unwrap_or(8)
        };
        if b[m] != ' ' {
            continue;
        }
        b[m] = p;
        for r in 0..3 {
            println!("{}|{}|{}", b[r * 3], b[r * 3 + 1], b[r * 3 + 2])
        }
        let won = (0..3).any(|i| {
            (b[i * 3] != ' ' && b[i * 3] == b[i * 3 + 1] && b[i * 3] == b[i * 3 + 2])
                || (b[i] != ' ' && b[i] == b[i + 3] && b[i] == b[i + 6])
        }) || b[0] != ' ' && (b[0] == b[4] && b[0] == b[8])
            || b[2] != ' ' && (b[2] == b[4] && b[2] == b[6]);
        if won {
            println!("winner: {p}");
            return;
        }
    }
    println!("draw");
}
