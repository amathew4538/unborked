#[repr(C)]
struct Range {
    low: i32,
    high: i32,
}
extern "C" fn make_range(a: i32, b: i32) -> Range {
    Range { low: a, high: b }
}
fn main() {
    let range = make_range(10, 20);
    println!(
        "feature=DynamicInitialization low={} high={}",
        range.low, range.high
    );
}
