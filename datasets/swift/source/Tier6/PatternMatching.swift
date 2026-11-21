import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 65*17+3
    return result + seed + value
}
let seed = 65
let value = Int(CommandLine.arguments.dropFirst().first ?? "65") ?? seed
print("feature=PatternMatching tier=6 seed=\(seed) result=\(feature(seed, value))")
