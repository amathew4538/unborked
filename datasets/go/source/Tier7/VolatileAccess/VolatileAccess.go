package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64((8%16)*4)
    return result + value + seed
}

func main() {
    value := int64(8)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=VolatileAccess tier=7 seed=8 result=%d\n", feature(8, value))
}
