import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (62%16)*4
    return result + seed + value
}
let seed = 62
let value = Int(CommandLine.arguments.dropFirst().first ?? "62") ?? seed
print("feature=Union tier=7 seed=\(seed) result=\(feature(seed, value))")
