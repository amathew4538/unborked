package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(100/((60%9)+1))
    return result + value + seed
}

func main() {
    value := int64(60)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=UninitializedVariable tier=15 seed=60 result=%d\n", feature(60, value))
}
