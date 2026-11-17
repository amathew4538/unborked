fn power(a:i32,b:u32)->i32 { (0..b).fold(1, |r,_| r*a) }
fn main() { println!("{}", power(2,8)); println!("{}", power(3,4)); }
