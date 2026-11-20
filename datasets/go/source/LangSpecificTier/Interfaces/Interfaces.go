package main

import "fmt"

type Exporter interface{ Export() string }
type CSV struct{ Rows int }

func (c CSV) Export() string { return fmt.Sprintf("csv_rows=%d", c.Rows) }
func main()                  { var e Exporter = CSV{Rows: 128}; fmt.Println(e.Export()) }
