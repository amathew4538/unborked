package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(100/((66%9)+1))
    return result + value + seed
}

func main() {
    value := int64(66)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=UnusedVariable tier=15 seed=66 result=%d\n", feature(66, value))
}
