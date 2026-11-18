add :: Num a => a -> a -> a
add a b = a + b

main :: IO ()
main = mapM_ print [add 0 1, add 7 13, add 65536 1000, add 64 8, add (-42) (-1)]
