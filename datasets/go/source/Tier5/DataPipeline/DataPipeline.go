package DataPipeline

import "fmt"

func main() {
	input := []int{1, 2, 3, 4, 5, 6}
	count, sum := 0, 0
	for _, value := range input {
		if value%2 == 0 { count++; sum += value * value }
	}
	fmt.Println("processed:", count)
	fmt.Println("squares sum:", sum)
}
