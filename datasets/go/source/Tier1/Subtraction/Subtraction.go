package Subtraction

import "fmt"

func subtract(a, b int) int {
	return a - b
}

func main() {
	fmt.Println(subtract(0, 1))
	fmt.Println(subtract(7, 13))
	fmt.Println(subtract(65536, 1000))
	fmt.Println(subtract(64, 8))
	fmt.Println(subtract(-42, -1))
}
