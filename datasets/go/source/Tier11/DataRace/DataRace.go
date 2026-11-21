package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(1+(96%8))
    return result + value + seed
}

func main() {
    value := int64(96)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=DataRace tier=11 seed=96 result=%d\n", feature(96, value))
}
