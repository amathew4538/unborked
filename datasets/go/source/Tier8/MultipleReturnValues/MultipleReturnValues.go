package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(3+((3%5)*7))
    return result + value + seed
}

func main() {
    value := int64(3)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=MultipleReturnValues tier=8 seed=3 result=%d\n", feature(3, value))
}
