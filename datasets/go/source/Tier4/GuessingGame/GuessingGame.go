package GuessingGame

import "fmt"

func main() {
	target := 5
	for turn, guess := range []int{7, 3, 5} {
		fmt.Printf("guess %d: %d\n", turn+1, guess)
		if guess == target {
			fmt.Printf("found: %d\n", target)
			break
		}
	}
}
