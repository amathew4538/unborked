package StateMachine

import "fmt"

type State string

func main() {
	states := []State{"IDLE", "RUNNING", "PAUSED", "STOPPED"}
	for _, state := range states {
		fmt.Println("state:", state)
	}
}
