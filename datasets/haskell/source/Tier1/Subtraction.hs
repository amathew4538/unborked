subtract :: Num a => a -> a -> a
subtract a b = a - b

main :: IO ()
main = mapM_ print [Main.subtract 0 1, Main.subtract 7 13, Main.subtract 65536 1000, Main.subtract 64 8, Main.subtract (-42) (-1)]
