import std/os
let path = "unborked_tier3.txt"
writeFile(path, "Hello, Dataset!")
echo "filesystem: ", readFile(path)
removeFile(path)
