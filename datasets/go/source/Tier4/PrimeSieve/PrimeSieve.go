package PrimeSieve

import "fmt"

func main() {
	limit := 30
	prime := make([]bool, limit+1)
	for i := 2; i <= limit; i++ {
		prime[i] = true
	}
	for i := 2; i*i <= limit; i++ {
		if prime[i] {
			for j := i * i; j <= limit; j += i {
				prime[j] = false
			}
		}
	}
	fmt.Print("primes:")
	for i := 2; i <= limit; i++ {
		if prime[i] {
			fmt.Print(" ", i)
		}
	}
	fmt.Println()
}
