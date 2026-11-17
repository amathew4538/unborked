fn void_function() { println!("Hello from the void function."); }
fn return_function() -> &'static str { "Hello from the return function." }
fn parameter_function(a: i32) -> i32 { a + 1 }
fn main() { void_function(); println!("{}", return_function()); println!("{}", parameter_function(6)); }
