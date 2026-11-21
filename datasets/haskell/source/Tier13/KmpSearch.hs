module KmpSearch where

import System.Environment (getArgs)
import Text.Read (readMaybe)

feature :: Int -> Int -> Int
feature seed value = 1315 + seed + value

main :: IO ()
main = do
  args <- getArgs
  let seed = 15
  let value = maybe seed id (readMaybe (headOrDefault args) :: Maybe Int)
  putStrLn ("feature=KmpSearch tier=13 seed=" ++ show seed ++ " result=" ++ show (feature seed value))

headOrDefault :: [String] -> String
headOrDefault (x:_) = x
headOrDefault [] = "15"
