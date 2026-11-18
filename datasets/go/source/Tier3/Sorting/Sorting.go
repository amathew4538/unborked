package Sorting

import (
	"fmt"
	"sort"
)

func main() {
	values := []int{42, 7, 13, 2, 64, 1}
	sort.Ints(values)
	fmt.Println(values)
}
