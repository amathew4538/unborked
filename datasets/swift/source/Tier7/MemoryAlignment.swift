import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (44%16)*4
    return result + seed + value
}
let seed = 44
let value = Int(CommandLine.arguments.dropFirst().first ?? "44") ?? seed
print("feature=MemoryAlignment tier=7 seed=\(seed) result=\(feature(seed, value))")
