import System.Directory (removeFile)

main :: IO ()
main = do
  writeFile "unborked_tier3.txt" "Hello, Dataset!"
  content <- readFile "unborked_tier3.txt"
  putStrLn ("filesystem: " ++ content)
  removeFile "unborked_tier3.txt"
