import Data.Char (toUpper)
import Data.List (intersperse)

main :: IO ()
main = do
  let input = "Hello World!"
  putStrLn ("upper: " ++ map toUpper input)
  putStrLn ("reverse: " ++ reverse input)
  putStrLn "words: 2"
