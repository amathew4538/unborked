main = do
    mapM_ print values
    print (sum values)
  where values = [2,4,6,8,10]
