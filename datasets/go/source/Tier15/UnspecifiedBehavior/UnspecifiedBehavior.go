package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(100/((62%9)+1))
    return result + value + seed
}

func main() {
    value := int64(62)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=UnspecifiedBehavior tier=15 seed=62 result=%d\n", feature(62, value))
}
