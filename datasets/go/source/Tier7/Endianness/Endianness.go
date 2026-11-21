package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64((0%16)*4)
    return result + value + seed
}

func main() {
    value := int64(0)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=Endianness tier=7 seed=0 result=%d\n", feature(0, value))
}
