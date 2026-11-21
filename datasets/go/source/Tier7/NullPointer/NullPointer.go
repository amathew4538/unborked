package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64((73%16)*4)
    return result + value + seed
}

func main() {
    value := int64(73)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=NullPointer tier=7 seed=73 result=%d\n", feature(73, value))
}
