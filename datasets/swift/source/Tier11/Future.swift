import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 1+(65%8)
    return result + seed + value
}
let seed = 65
let value = Int(CommandLine.arguments.dropFirst().first ?? "65") ?? seed
print("feature=Future tier=11 seed=\(seed) result=\(feature(seed, value))")
