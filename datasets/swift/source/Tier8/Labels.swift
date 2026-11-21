import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 64+((64%5)*7)
    return result + seed + value
}
let seed = 64
let value = Int(CommandLine.arguments.dropFirst().first ?? "64") ?? seed
print("feature=Labels tier=8 seed=\(seed) result=\(feature(seed, value))")
