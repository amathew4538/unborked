package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(63+((63%5)*7))
    return result + value + seed
}

func main() {
    value := int64(63)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=TailRecursion tier=8 seed=63 result=%d\n", feature(63, value))
}
