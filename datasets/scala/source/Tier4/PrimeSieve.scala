@main def main(): Unit = {
    val limit = 30
    val prime = (0 to limit).map(value => value >= 2).toArray
    for i <- 2 to Math.sqrt(limit).toInt if prime(i) do
      var multiple = i * i
      while multiple <= limit do { prime(multiple) = false; multiple += i }
    print("primes:")
    for i <- 2 to limit if prime(i) do print(" " + i)
    println()
}
