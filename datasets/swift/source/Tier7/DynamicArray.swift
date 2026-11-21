import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (50%16)*4
    return result + seed + value
}
let seed = 50
let value = Int(CommandLine.arguments.dropFirst().first ?? "50") ?? seed
print("feature=DynamicArray tier=7 seed=\(seed) result=\(feature(seed, value))")
