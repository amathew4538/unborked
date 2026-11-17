func voidFunction() { print("Hello from the void function.") }
func returnFunction() -> String { "Hello from the return function." }
func parameterFunction(_ a: Int) -> Int { a + 1 }
voidFunction(); print(returnFunction()); print(parameterFunction(6))
