package StringProcessing

import (
	"fmt"
	"strings"
)

func main() {
	input := "Hello World!"
	fmt.Println("upper:", strings.ToUpper(input))
	fmt.Println("reverse:", reverse(input))
	fmt.Println("words:", len(strings.Fields(input)))
}

func reverse(input string) string {
	runes := []rune(input)
	for left, right := 0, len(runes)-1; left < right; left, right = left+1, right-1 {
		runes[left], runes[right] = runes[right], runes[left]
	}
	return string(runes)
}
