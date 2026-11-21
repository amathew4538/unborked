import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 77+32
    return result + seed + value
}
let seed = 77
let value = Int(CommandLine.arguments.dropFirst().first ?? "77") ?? seed
print("feature=DynamicInitialization tier=10 seed=\(seed) result=\(feature(seed, value))")
