fn subtract(a:i32,b:i32)->i32 {
    a - b
}

fn main() {
    println!("{}", subtract(0,1));
    println!("{}", subtract(7,13));
    println!("{}", subtract(65536,1000));
    println!("{}", subtract(64,8));
    println!("{}", subtract(-42,-1));
}
