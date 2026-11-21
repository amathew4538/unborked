import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 88+32
    return result + seed + value
}
let seed = 88
let value = Int(CommandLine.arguments.dropFirst().first ?? "88") ?? seed
print("feature=PositionIndependentCode tier=10 seed=\(seed) result=\(feature(seed, value))")
