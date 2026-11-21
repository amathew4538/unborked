import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (83%64)*(83%64)
    return result + seed + value
}
let seed = 83
let value = Int(CommandLine.arguments.dropFirst().first ?? "83") ?? seed
print("feature=BinaryTree tier=13 seed=\(seed) result=\(feature(seed, value))")
