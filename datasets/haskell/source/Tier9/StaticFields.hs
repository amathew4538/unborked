module StaticFields where

import System.Environment (getArgs)
import Text.Read (readMaybe)

feature :: Int -> Int -> Int
feature seed value = 934 + seed + value

main :: IO ()
main = do
  args <- getArgs
  let seed = 34
  let value = maybe seed id (readMaybe (headOrDefault args) :: Maybe Int)
  putStrLn ("feature=StaticFields tier=9 seed=" ++ show seed ++ " result=" ++ show (feature seed value))

headOrDefault :: [String] -> String
headOrDefault (x:_) = x
headOrDefault [] = "34"
