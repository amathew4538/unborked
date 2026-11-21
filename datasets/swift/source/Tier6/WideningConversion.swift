import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 59*17+3
    return result + seed + value
}
let seed = 59
let value = Int(CommandLine.arguments.dropFirst().first ?? "59") ?? seed
print("feature=WideningConversion tier=6 seed=\(seed) result=\(feature(seed, value))")
