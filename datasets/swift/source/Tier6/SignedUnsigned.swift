import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 9*17+3
    return result + seed + value
}
let seed = 9
let value = Int(CommandLine.arguments.dropFirst().first ?? "9") ?? seed
print("feature=SignedUnsigned tier=6 seed=\(seed) result=\(feature(seed, value))")
