package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64((16%64)*(16%64))
    return result + value + seed
}

func main() {
    value := int64(16)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=GraphDFS tier=13 seed=16 result=%d\n", feature(16, value))
}
