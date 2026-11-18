modulo :: Integral a => a -> a -> a
modulo a b = a `mod` b

main :: IO ()
main = mapM_ print [modulo 0 1, modulo 7 13, modulo 65536 1000, modulo 64 8, modulo (-42) (-1)]
