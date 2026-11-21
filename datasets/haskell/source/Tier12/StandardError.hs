module StandardError where

import System.Environment (getArgs)
import Text.Read (readMaybe)

feature :: Int -> Int -> Int
feature seed value = 1249 + seed + value

main :: IO ()
main = do
  args <- getArgs
  let seed = 49
  let value = maybe seed id (readMaybe (headOrDefault args) :: Maybe Int)
  putStrLn ("feature=StandardError tier=12 seed=" ++ show seed ++ " result=" ++ show (feature seed value))

headOrDefault :: [String] -> String
headOrDefault (x:_) = x
headOrDefault [] = "49"
