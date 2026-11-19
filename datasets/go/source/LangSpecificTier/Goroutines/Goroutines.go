package main
import("fmt";"sync")
func main(){var wg sync.WaitGroup;wg.Add(2);go func(){defer wg.Done();fmt.Println("worker=compile") }();go func(){defer wg.Done();fmt.Println("worker=link") }();wg.Wait()}
