package main

import (
	"fmt"
	"sort"
)

func main() {
	values := []int{5, 1, 4, 2, 3}
	sort.Ints(values)
	fmt.Printf("feature=%s sorted=%v\n", "Heap", values)
}
