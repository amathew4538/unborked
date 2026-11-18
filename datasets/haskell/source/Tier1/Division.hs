divide :: Fractional a => a -> a -> a
divide a b = a / b

main :: IO ()
main = mapM_ print [divide 0 1, divide 7 13, divide 65536 1000, divide 64 8, divide (-42) (-1)]
