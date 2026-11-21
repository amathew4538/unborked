import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (31%64)*(31%64)
    return result + seed + value
}
let seed = 31
let value = Int(CommandLine.arguments.dropFirst().first ?? "31") ?? seed
print("feature=AvlTree tier=13 seed=\(seed) result=\(feature(seed, value))")
