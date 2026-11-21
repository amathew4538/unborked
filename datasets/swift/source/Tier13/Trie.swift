import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (61%64)*(61%64)
    return result + seed + value
}
let seed = 61
let value = Int(CommandLine.arguments.dropFirst().first ?? "61") ?? seed
print("feature=Trie tier=13 seed=\(seed) result=\(feature(seed, value))")
