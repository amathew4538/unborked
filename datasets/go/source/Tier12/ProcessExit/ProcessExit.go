package main
import("bufio";"fmt";"os")
func main(){scanner:=bufio.NewScanner(os.Stdin);count:=0;for scanner.Scan(){count++};fmt.Printf("feature=%s args=%v lines=%d\n","ProcessExit",os.Args[1:],count)}
