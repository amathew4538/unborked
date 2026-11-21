extern "C" {
    fn strtol(text: *const i8, end: *mut *mut i8, base: i32) -> i64;
}

fn main() {
    let text = std::env::args().nth(1).unwrap_or_else(|| "8080".to_string());
    let mut end = std::ptr::null_mut();
    let bytes = format!("{}\0", text);
    let port = unsafe { strtol(bytes.as_ptr().cast(), &mut end, 10) };
    let valid = port >= 1 && port <= 65535;
    println!("CInterop extern-C=strtol port={port} valid={valid}");
}
