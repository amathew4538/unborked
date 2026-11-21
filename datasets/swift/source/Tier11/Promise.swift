import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 1+(89%8)
    return result + seed + value
}
let seed = 89
let value = Int(CommandLine.arguments.dropFirst().first ?? "89") ?? seed
print("feature=Promise tier=11 seed=\(seed) result=\(feature(seed, value))")
