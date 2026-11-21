package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(91+32)
    return result + value + seed
}

func main() {
    value := int64(91)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=DynamicLinking tier=10 seed=91 result=%d\n", feature(91, value))
}
