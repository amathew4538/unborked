import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((59%9)+1)
    return result + seed + value
}
let seed = 59
let value = Int(CommandLine.arguments.dropFirst().first ?? "59") ?? seed
print("feature=DeepRecursion tier=15 seed=\(seed) result=\(feature(seed, value))")
