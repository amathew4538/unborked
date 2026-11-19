module ProcessExit where

import System.Environment (getArgs)
import Text.Read (readMaybe)

applyFeature :: Int -> Int
applyFeature value = value * value + 3

main :: IO ()
main = do
  args <- getArgs
  let value = maybe 42 id (readMaybe (headOrDefault args) :: Maybe Int)
  putStrLn ("feature=ProcessExit value=" ++ show value ++ " result=" ++ show (applyFeature value))

headOrDefault :: [String] -> String
headOrDefault (x:_) = x
headOrDefault [] = "42"
