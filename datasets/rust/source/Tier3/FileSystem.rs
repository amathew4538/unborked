use std::fs;

fn main() {
    let path = "unborked_tier3.txt";
    fs::write(path, "Hello, Dataset!").expect("write failed");
    let content = fs::read_to_string(path).expect("read failed");
    println!("filesystem: {}", content);
    fs::remove_file(path).expect("remove failed");
}
