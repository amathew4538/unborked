import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 45*17+3
    return result + seed + value
}
let seed = 45
let value = Int(CommandLine.arguments.dropFirst().first ?? "45") ?? seed
print("feature=BitwiseXor tier=6 seed=\(seed) result=\(feature(seed, value))")
