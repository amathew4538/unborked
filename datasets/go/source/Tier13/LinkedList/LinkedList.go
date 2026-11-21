package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64((90%64)*(90%64))
    return result + value + seed
}

func main() {
    value := int64(90)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=LinkedList tier=13 seed=90 result=%d\n", feature(90, value))
}
