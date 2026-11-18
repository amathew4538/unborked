power :: (Integral b, Num a) => a -> b -> a
power a b = a ^ b

main :: IO ()
main = mapM_ print [power 2 8, power 3 4]
