main :: IO ()
main = do
  putStrLn "generation: 1"
  mapM_ putStrLn ["..#..", "..#..", "..#..", ".....", "....."]
