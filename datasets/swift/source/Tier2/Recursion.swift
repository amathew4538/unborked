func factorial(_ n:Int)->Int {
    n <= 1 ? 1 : n * factorial(n-1)
}

print(factorial(5))
