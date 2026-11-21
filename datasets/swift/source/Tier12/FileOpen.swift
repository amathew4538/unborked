import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 73%1024
    return result + seed + value
}
let seed = 73
let value = Int(CommandLine.arguments.dropFirst().first ?? "73") ?? seed
print("feature=FileOpen tier=12 seed=\(seed) result=\(feature(seed, value))")
