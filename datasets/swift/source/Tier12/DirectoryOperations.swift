import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 72%1024
    return result + seed + value
}
let seed = 72
let value = Int(CommandLine.arguments.dropFirst().first ?? "72") ?? seed
print("feature=DirectoryOperations tier=12 seed=\(seed) result=\(feature(seed, value))")
