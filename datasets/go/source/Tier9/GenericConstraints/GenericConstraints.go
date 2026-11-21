package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64((76%11)+40)
    return result + value + seed
}

func main() {
    value := int64(76)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=GenericConstraints tier=9 seed=76 result=%d\n", feature(76, value))
}
