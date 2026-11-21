import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 70*17+3
    return result + seed + value
}
let seed = 70
let value = Int(CommandLine.arguments.dropFirst().first ?? "70") ?? seed
print("feature=Comparison tier=6 seed=\(seed) result=\(feature(seed, value))")
