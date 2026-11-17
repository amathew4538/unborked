func classify(_ n:Int)->String { n < 0 ? "negative" : n > 0 ? "positive" : "zero" }
print(classify(-1)); print(classify(0)); print(classify(1))
