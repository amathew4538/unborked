package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(100/((36%9)+1))
    return result + value + seed
}

func main() {
    value := int64(36)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=UseAfterFree tier=15 seed=36 result=%d\n", feature(36, value))
}
