voidFunction = putStrLn "Hello from the void function."
returnFunction = "Hello from the return function."
parameterFunction a = a + 1
main = do
    voidFunction
    putStrLn returnFunction
    print (parameterFunction 6)
