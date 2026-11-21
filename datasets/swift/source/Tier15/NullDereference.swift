import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((26%9)+1)
    return result + seed + value
}
let seed = 26
let value = Int(CommandLine.arguments.dropFirst().first ?? "26") ?? seed
print("feature=NullDereference tier=15 seed=\(seed) result=\(feature(seed, value))")
