package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(100/((94%9)+1))
    return result + value + seed
}

func main() {
    value := int64(94)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=OutOfBoundsAccess tier=15 seed=94 result=%d\n", feature(94, value))
}
