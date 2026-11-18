package GameOfLife

import "fmt"

func main() {
	grid := [5][5]bool{}
	grid[1][2], grid[2][2], grid[3][2] = true, true, true
	next := [5][5]bool{}
	for row := 0; row < 5; row++ {
		for column := 0; column < 5; column++ {
			neighbours := 0
			for dy := -1; dy <= 1; dy++ {
				for dx := -1; dx <= 1; dx++ {
					if dx == 0 && dy == 0 { continue }
					y, x := row+dy, column+dx
					if y >= 0 && y < 5 && x >= 0 && x < 5 && grid[y][x] { neighbours++ }
				}
			}
			next[row][column] = neighbours == 3 || (grid[row][column] && neighbours == 2)
		}
	}
	fmt.Println("generation: 1")
	for _, row := range next {
		for _, cell := range row { if cell { fmt.Print("#") } else { fmt.Print(".") } }
		fmt.Println()
	}
}
