import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (82%64)*(82%64)
    return result + seed + value
}
let seed = 82
let value = Int(CommandLine.arguments.dropFirst().first ?? "82") ?? seed
print("feature=Stack tier=13 seed=\(seed) result=\(feature(seed, value))")
