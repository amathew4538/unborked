package Matrix

import "fmt"

func main() {
	left := [2][3]int{{1, 2, 3}, {4, 5, 6}}
	right := [3][2]int{{7, 8}, {9, 10}, {11, 12}}
	for row := 0; row < 2; row++ {
		for column := 0; column < 2; column++ {
			value := 0
			for inner := 0; inner < 3; inner++ {
				value += left[row][inner] * right[inner][column]
			}
			fmt.Printf("%d", value)
			if column == 1 {
				fmt.Println()
			} else {
				fmt.Print(" ")
			}
		}
	}
}
