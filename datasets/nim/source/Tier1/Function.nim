proc voidFunction() = echo "Hello from the void function."

proc returnFunction(): string = "Hello from the return function."

proc parameterFunction(a: int): int = a + 1

voidFunction()
echo returnFunction()
echo parameterFunction(6)
