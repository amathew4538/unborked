import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 54%1024
    return result + seed + value
}
let seed = 54
let value = Int(CommandLine.arguments.dropFirst().first ?? "54") ?? seed
print("feature=MemoryMappedFiles tier=12 seed=\(seed) result=\(feature(seed, value))")
