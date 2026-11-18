classify :: (Ord a, Num a) => a -> String
classify n | n < 0 = "negative" | n > 0 = "positive" | otherwise = "zero"

main :: IO ()
main = mapM_ putStrLn [classify (-1), classify 0, classify 1]
