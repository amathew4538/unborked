fn power(a int,b int) int { mut result:=1; for _ in 0..b { result*=a }; return result }
fn main() { println(power(2,8)); println(power(3,4)) }
