package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(1+(57%8))
    return result + value + seed
}

func main() {
    value := int64(57)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=AtomicStore tier=11 seed=57 result=%d\n", feature(57, value))
}
