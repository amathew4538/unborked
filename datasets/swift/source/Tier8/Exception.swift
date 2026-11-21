import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 29+((29%5)*7)
    return result + seed + value
}
let seed = 29
let value = Int(CommandLine.arguments.dropFirst().first ?? "29") ?? seed
print("feature=Exception tier=8 seed=\(seed) result=\(feature(seed, value))")
