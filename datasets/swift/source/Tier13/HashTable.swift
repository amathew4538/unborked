import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (26%64)*(26%64)
    return result + seed + value
}
let seed = 26
let value = Int(CommandLine.arguments.dropFirst().first ?? "26") ?? seed
print("feature=HashTable tier=13 seed=\(seed) result=\(feature(seed, value))")
