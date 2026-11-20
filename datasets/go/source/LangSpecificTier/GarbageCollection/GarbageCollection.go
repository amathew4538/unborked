package main

import (
	"fmt"
	"runtime"
)

func main() {
	records := []map[string]int{{"ok": 1}, {"ok": 2}}
	runtime.GC()
	var stats runtime.MemStats
	runtime.ReadMemStats(&stats)
	fmt.Printf("records=%d allocated_bytes=%d\n", len(records), stats.Alloc)
}
