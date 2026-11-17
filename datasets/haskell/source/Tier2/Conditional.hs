classify n | n < 0 = "negative" | n > 0 = "positive" | otherwise = "zero"
main = mapM_ putStrLn [classify (-1), classify 0, classify 1]
