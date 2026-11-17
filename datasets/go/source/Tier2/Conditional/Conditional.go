package Conditional

import "fmt"

func classify(n int) string {
	if n < 0 { return "negative" }
	if n > 0 { return "positive" }
	return "zero"
}

func main() {
	fmt.Println(classify(-1))
	fmt.Println(classify(0))
	fmt.Println(classify(1))
}
