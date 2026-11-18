factorial :: (Ord t, Num t) => t -> t
factorial n = if n <= 1 then 1 else n * factorial (n - 1)

main :: IO ()
main = print (factorial 5)
