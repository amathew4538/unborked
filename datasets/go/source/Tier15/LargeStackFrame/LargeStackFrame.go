package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(100/((85%9)+1))
    return result + value + seed
}

func main() {
    value := int64(85)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=LargeStackFrame tier=15 seed=85 result=%d\n", feature(85, value))
}
