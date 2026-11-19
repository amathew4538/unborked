func power(_ a: Int, _ b: Int) -> Int {
    var result = 1
    for _ in 0..<b { result *= a }
    return result
}

print(power(2, 8)); print(power(3, 4))
