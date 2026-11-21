import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 61+((61%5)*7)
    return result + seed + value
}
let seed = 61
let value = Int(CommandLine.arguments.dropFirst().first ?? "61") ?? seed
print("feature=NestedFunction tier=8 seed=\(seed) result=\(feature(seed, value))")
