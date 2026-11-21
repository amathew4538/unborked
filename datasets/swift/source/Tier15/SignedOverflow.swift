import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((65%9)+1)
    return result + seed + value
}
let seed = 65
let value = Int(CommandLine.arguments.dropFirst().first ?? "65") ?? seed
print("feature=SignedOverflow tier=15 seed=\(seed) result=\(feature(seed, value))")
