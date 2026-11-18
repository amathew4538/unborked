package BinarySearch

import (
	"fmt"
	"sort"
)

func main() {
	values := []int{2, 7, 13, 42, 64, 100}
	index := sort.Search(len(values), func(i int) bool { return values[i] >= 42 })
	fmt.Println("index:", index)
}
