import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 0%1024
    return result + seed + value
}
let seed = 0
let value = Int(CommandLine.arguments.dropFirst().first ?? "0") ?? seed
print("feature=NetworkServer tier=12 seed=\(seed) result=\(feature(seed, value))")
