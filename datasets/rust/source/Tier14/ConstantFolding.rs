#[inline(always)]
fn square(x: i64) -> i64 {
    x * x
}
fn main() {
    let mut sum = 0i64;
    for i in 0..1024 {
        sum += square(i);
    }
    println!("feature=ConstantFolding sum={}", sum);
}
