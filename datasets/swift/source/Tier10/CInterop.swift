import Foundation

let text = CommandLine.arguments.dropFirst().first ?? "8080"
let port = strtol(text, nil, 10)
let valid = port >= 1 && port <= 65535
print("CInterop C-call=strtol port=\(port) valid=\(valid)")
