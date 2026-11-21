import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (87%64)*(87%64)
    return result + seed + value
}
let seed = 87
let value = Int(CommandLine.arguments.dropFirst().first ?? "87") ?? seed
print("feature=UnionFind tier=13 seed=\(seed) result=\(feature(seed, value))")
