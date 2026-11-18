voidFunction :: IO ()
voidFunction = putStrLn "Hello from the void function."

returnFunction :: String
returnFunction = "Hello from the return function."

parameterFunction :: Num a => a -> a
parameterFunction a = a + 1

main :: IO ()
main = do
    voidFunction
    putStrLn returnFunction
    print (parameterFunction 6)
