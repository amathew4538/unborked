package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(28*17+3)
    return result + value + seed
}

func main() {
    value := int64(28)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=ImplicitConversion tier=6 seed=28 result=%d\n", feature(28, value))
}
