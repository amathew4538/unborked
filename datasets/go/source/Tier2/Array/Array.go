package Array

import "fmt"

func main() {
	values := []int{2, 4, 6, 8, 10}
	sum := 0
	for _, value := range values {
		fmt.Println(value)
		sum += value
	}
	fmt.Println(sum)
}
