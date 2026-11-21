import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (4%16)*4
    return result + seed + value
}
let seed = 4
let value = Int(CommandLine.arguments.dropFirst().first ?? "4") ?? seed
print("feature=MemoryCopy tier=7 seed=\(seed) result=\(feature(seed, value))")
