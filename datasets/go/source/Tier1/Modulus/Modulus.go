package Modulus

import "fmt"

func modulo(a, b int) int {
	return a % b
}

func main() {
	fmt.Println(modulo(0, 1))
	fmt.Println(modulo(7, 13))
	fmt.Println(modulo(65536, 1000))
	fmt.Println(modulo(64, 8))
	fmt.Println(modulo(-42, -1))
}
