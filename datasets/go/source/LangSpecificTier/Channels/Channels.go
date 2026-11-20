package main

import "fmt"

func main() {
	jobs := make(chan int, 3)
	for i := 1; i <= 3; i++ {
		jobs <- i
	}
	close(jobs)
	sum := 0
	for job := range jobs {
		sum += job
	}
	fmt.Println("channel_sum=", sum)
}
