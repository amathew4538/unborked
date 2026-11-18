package TicTacToe

import "fmt"

func main() {
	board := [3][3]string{{"X", "O", "X"}, {"O", "X", "O"}, {"X", "O", "X"}}
	for _, row := range board {
		fmt.Println(row[0], row[1], row[2])
	}
	fmt.Println("winner: X")
}
