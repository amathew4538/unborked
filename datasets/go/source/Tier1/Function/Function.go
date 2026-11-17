package Function

import "fmt"

func void_function() {
	fmt.Println("Hello from the void function.")
}

func return_function() string {
	return "Hello from the return function"
}

func parameter_function(a int) int {
	return a + 1
}

func main() {
	void_function()
	fmt.Println(return_function())
	fmt.Println(parameter_function(6))
}
