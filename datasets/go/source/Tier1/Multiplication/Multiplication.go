package Multiplication

import "fmt"

func multiply(a, b int) int {
	return a * b
}

func main() {
	fmt.Println(multiply(0, 1))
	fmt.Println(multiply(7, 13))
	fmt.Println(multiply(65536, 1000))
	fmt.Println(multiply(64, 8))
	fmt.Println(multiply(-42, -1))
}
