import os

fn main() {
    path := 'unborked_tier3.txt'
    os.write_file(path, 'Hello, Dataset!') or { panic(err) }
    content := os.read_file(path) or { panic(err) }
    println('filesystem: ' + content)
    os.rm(path) or { panic(err) }
}
