import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 83%1024
    return result + seed + value
}
let seed = 83
let value = Int(CommandLine.arguments.dropFirst().first ?? "83") ?? seed
print("feature=NetworkClient tier=12 seed=\(seed) result=\(feature(seed, value))")
