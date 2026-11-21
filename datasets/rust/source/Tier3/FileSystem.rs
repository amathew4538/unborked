use std::{env, fs};
fn main() {
    let path = env::args().nth(1).unwrap_or_else(|| "unborked.conf".into());
    fs::write(&path, "log_level=info\ntheme=dark\n").unwrap();
    println!("{}:\n{}", path, fs::read_to_string(&path).unwrap());
    let _ = fs::remove_file(path);
}
