import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 3*17+3
    return result + seed + value
}
let seed = 3
let value = Int(CommandLine.arguments.dropFirst().first ?? "3") ?? seed
print("feature=BitwiseAnd tier=6 seed=\(seed) result=\(feature(seed, value))")
