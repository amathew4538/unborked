import Foundation

let path = "unborked_tier3.txt"
try! "Hello, Dataset!".write(toFile: path, atomically: true, encoding: .utf8)
let content = try! String(contentsOfFile: path, encoding: .utf8)
try! FileManager.default.removeItem(atPath: path)
print("filesystem: \(content)")
