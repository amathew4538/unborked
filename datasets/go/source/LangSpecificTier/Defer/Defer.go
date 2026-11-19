package main
import "fmt"
func report(){defer fmt.Println("cleanup: report closed");fmt.Println("write: report saved")}
func main(){report()}
