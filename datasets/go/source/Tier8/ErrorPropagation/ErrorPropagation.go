package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(44+((44%5)*7))
    return result + value + seed
}

func main() {
    value := int64(44)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=ErrorPropagation tier=8 seed=44 result=%d\n", feature(44, value))
}
