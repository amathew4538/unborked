import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 49%1024
    return result + seed + value
}
let seed = 49
let value = Int(CommandLine.arguments.dropFirst().first ?? "49") ?? seed
print("feature=StandardError tier=12 seed=\(seed) result=\(feature(seed, value))")
