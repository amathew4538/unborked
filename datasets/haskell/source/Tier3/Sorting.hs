import Data.List (sort)

main :: IO ()
main = putStrLn (unwords (map show (sort [42, 7, 13, 2, 64, 1])))
