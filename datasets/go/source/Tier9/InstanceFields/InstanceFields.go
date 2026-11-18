package main
import "fmt"
type Report interface{Render()string}
type Inventory struct{Items int}
func(i Inventory)Render()string{return fmt.Sprintf("items=%d",i.Items)}
func main(){var r Report=Inventory{Items:5};fmt.Printf("feature=%s report=%s\n","InstanceFields",r.Render())}
