import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (25%16)*4
    return result + seed + value
}
let seed = 25
let value = Int(CommandLine.arguments.dropFirst().first ?? "25") ?? seed
print("feature=MemoryMove tier=7 seed=\(seed) result=\(feature(seed, value))")
