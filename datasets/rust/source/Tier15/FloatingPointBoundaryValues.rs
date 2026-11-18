fn checked_divide(a:i64,b:i64)->Result<i64,&'static str> { if b==0 { Err("division by zero") } else { Ok(a/b) } }
fn main() {
 println!("feature=FloatingPointBoundaryValues result={:?}",checked_divide(100,4));
 println!("feature=FloatingPointBoundaryValues result={:?}",checked_divide(100,0));
}
