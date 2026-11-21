package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(1+(71%8))
    return result + value + seed
}

func main() {
    value := int64(71)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=AsyncAwait tier=11 seed=71 result=%d\n", feature(71, value))
}
