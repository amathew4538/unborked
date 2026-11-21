import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((60%9)+1)
    return result + seed + value
}
let seed = 60
let value = Int(CommandLine.arguments.dropFirst().first ?? "60") ?? seed
print("feature=UninitializedVariable tier=15 seed=\(seed) result=\(feature(seed, value))")
