package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64(23%1024)
    return result + value + seed
}

func main() {
    value := int64(23)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=StandardOutput tier=12 seed=23 result=%d\n", feature(23, value))
}
