import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((29%9)+1)
    return result + seed + value
}
let seed = 29
let value = Int(CommandLine.arguments.dropFirst().first ?? "29") ?? seed
print("feature=NestedScopes tier=15 seed=\(seed) result=\(feature(seed, value))")
