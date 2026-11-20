fn apply<F: Fn(i32) -> i32>(f: F, x: i32) -> i32 {
    f(x)
}
fn main() {
    let result = apply(|x| x * x + 3, 7);
    println!("feature=FunctionOverloading result={}", result);
}
