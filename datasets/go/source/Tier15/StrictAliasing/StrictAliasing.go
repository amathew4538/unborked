package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(100/((35%9)+1))
    return result + value + seed
}

func main() {
    value := int64(35)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=StrictAliasing tier=15 seed=35 result=%d\n", feature(35, value))
}
