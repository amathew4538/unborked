package main
import("fmt";"sync")
func main(){var mu sync.Mutex;balance:=100;var wg sync.WaitGroup;for i:=0;i<4;i++{wg.Add(1);go func(){defer wg.Done();mu.Lock();balance+=25;mu.Unlock()}()};wg.Wait();mu.Lock();fmt.Printf("feature=%s balance=%d\n","Semaphore",balance);mu.Unlock()}
