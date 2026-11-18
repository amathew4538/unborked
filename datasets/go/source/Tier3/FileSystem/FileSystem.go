package FileSystem

import (
	"fmt"
	"os"
)

func main() {
	path := "unborked_tier3.txt"
	if err := os.WriteFile(path, []byte("Hello, Dataset!"), 0644); err != nil {
		panic(err)
	}
	content, err := os.ReadFile(path)
	if err != nil {
		panic(err)
	}
	fmt.Printf("filesystem: %s\n", content)
	if err := os.Remove(path); err != nil {
		panic(err)
	}
}
