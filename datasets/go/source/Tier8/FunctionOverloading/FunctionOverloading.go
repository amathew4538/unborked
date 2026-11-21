package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(20+((20%5)*7))
    return result + value + seed
}

func main() {
    value := int64(20)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=FunctionOverloading tier=8 seed=20 result=%d\n", feature(20, value))
}
