package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64((13*(13+1))/2)
    return result + value + seed
}

func main() {
    value := int64(13)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=LoopVectorization tier=14 seed=13 result=%d\n", feature(13, value))
}
