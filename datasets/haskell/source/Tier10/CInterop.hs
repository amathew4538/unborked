{-# LANGUAGE ForeignFunctionInterface #-}
module CInterop where
import System.Environment (getArgs)
import Foreign.C.String (CString, newCString)
import Foreign.C.Types (CChar, CInt, CLong)
import Foreign.Ptr (Ptr, nullPtr)
foreign import ccall "strtol" c_strtol :: CString -> Ptr (Ptr CChar) -> CInt -> IO CLong
main :: IO ()
main = do
  args <- getArgs
  text <- newCString (if null args then "8080" else head args)
  port <- c_strtol text nullPtr 10
  let portValue = fromIntegral port :: Integer
  putStrLn ("CInterop FFI=strtol port=" ++ show portValue ++ " valid=" ++ show (portValue >= 1 && portValue <= 65535))
