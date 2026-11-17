package Addition

import "fmt"

func add(a, b int) int {
	return a + b
}

func main() {
	fmt.Println(add(0, 1))
	fmt.Println(add(7, 13))
	fmt.Println(add(65536, 1000))
	fmt.Println(add(64, 8))
	fmt.Println(add(-42, -1))
}
