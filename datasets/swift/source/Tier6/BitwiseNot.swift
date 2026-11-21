import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 82*17+3
    return result + seed + value
}
let seed = 82
let value = Int(CommandLine.arguments.dropFirst().first ?? "82") ?? seed
print("feature=BitwiseNot tier=6 seed=\(seed) result=\(feature(seed, value))")
