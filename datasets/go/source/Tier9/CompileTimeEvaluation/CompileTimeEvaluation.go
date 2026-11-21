package main

import (
    "fmt"
    "os"
    "strconv"
)

func feature(seed int64, value int64) int64 {
    result := int64((83%11)+40)
    return result + value + seed
}

func main() {
    value := int64(83)
    if len(os.Args) > 1 {
        if parsed, err := strconv.ParseInt(os.Args[1], 10, 64); err == nil { value = parsed }
    }
    fmt.Printf("feature=CompileTimeEvaluation tier=9 seed=83 result=%d\n", feature(83, value))
}
