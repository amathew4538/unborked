package main

import (
	"fmt"
	"os"
)

func main() { args := os.Args[1:]; fmt.Printf("feature=%s args=%v\n", "FloatingPointRounding", args) }
