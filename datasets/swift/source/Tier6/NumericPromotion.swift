import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 96*17+3
    return result + seed + value
}
let seed = 96
let value = Int(CommandLine.arguments.dropFirst().first ?? "96") ?? seed
print("feature=NumericPromotion tier=6 seed=\(seed) result=\(feature(seed, value))")
