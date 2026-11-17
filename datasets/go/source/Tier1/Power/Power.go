package Power

import "fmt"

func power(a, b int) int {
	result := 1
	for i := 0; i < b; i++ {
		result *= a
	}
	return result
}

func main() {
	fmt.Println(power(2, 8))
	fmt.Println(power(3, 4))
}
