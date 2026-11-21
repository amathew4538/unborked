#include <stdlib.h>

fn C.strtol(text &char, end &void, base int) i64

fn main() {
    text := '8080'
    args := os.args
    if args.len > 1 { text = args[1] }
    end := &char(0)
    port := C.strtol(text.str, &end, 10)
    println('CInterop C-call=strtol port=' + port.str() + ' valid=' + (port >= 1 && port <= 65535).str())
}
