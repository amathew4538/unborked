import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((20%9)+1)
    return result + seed + value
}
let seed = 20
let value = Int(CommandLine.arguments.dropFirst().first ?? "20") ?? seed
print("feature=FloatingPointBoundaryValues tier=15 seed=\(seed) result=\(feature(seed, value))")
