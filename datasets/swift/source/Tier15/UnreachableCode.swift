import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((35%9)+1)
    return result + seed + value
}
let seed = 35
let value = Int(CommandLine.arguments.dropFirst().first ?? "35") ?? seed
print("feature=UnreachableCode tier=15 seed=\(seed) result=\(feature(seed, value))")
