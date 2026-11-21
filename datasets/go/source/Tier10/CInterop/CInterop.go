package main
/*
#include <stdlib.h>
*/
import "C"
import (
    "fmt"
    "os"
    "unsafe"
)

func main() {
    text := "8080"
    if len(os.Args) > 1 { text = os.Args[1] }
    cText := C.CString(text)
    defer C.free(unsafe.Pointer(cText))
    var end *C.char
    port := C.strtol(cText, &end, 10)
    valid := port >= 1 && port <= 65535
    fmt.Printf("CInterop cgo=strtol port=%d valid=%t\n", port, valid)
}
