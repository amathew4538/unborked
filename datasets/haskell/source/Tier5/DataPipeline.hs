main :: IO ()
main = do
  let processed = map (\x -> x * x) (filter even [1..6])
  putStrLn ("processed: " ++ show (length processed))
  putStrLn ("squares sum: " ++ show (sum processed))
