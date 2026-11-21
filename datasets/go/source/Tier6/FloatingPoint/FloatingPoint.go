package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(21*17+3)
    return result + value + seed
}

func main() {
    value := int64(21)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=FloatingPoint tier=6 seed=21 result=%d\n", feature(21, value))
}
