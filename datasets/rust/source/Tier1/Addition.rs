fn add(a:i32,b:i32)->i32 {
    a + b
}

fn main() {
    println!("{}", add(0,1));
    println!("{}", add(7,13));
    println!("{}", add(65536,1000));
    println!("{}", add(64,8));
    println!("{}", add(-42,-1));
}
