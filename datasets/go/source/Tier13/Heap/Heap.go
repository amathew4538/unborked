package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64((43%64)*(43%64))
    return result + value + seed
}

func main() {
    value := int64(43)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=Heap tier=13 seed=43 result=%d\n", feature(43, value))
}
