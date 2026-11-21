package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(88+32)
    return result + value + seed
}

func main() {
    value := int64(88)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=PositionIndependentCode tier=10 seed=88 result=%d\n", feature(88, value))
}
