package Division

import "fmt"

func divide(a, b int) int {
	return a / b
}

func main() {
	fmt.Println(divide(0, 1))
	fmt.Println(divide(7, 13))
	fmt.Println(divide(65536, 1000))
	fmt.Println(divide(64, 8))
	fmt.Println(divide(-42, -1))
}
