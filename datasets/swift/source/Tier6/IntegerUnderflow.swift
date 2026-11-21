import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 67*17+3
    return result + seed + value
}
let seed = 67
let value = Int(CommandLine.arguments.dropFirst().first ?? "67") ?? seed
print("feature=IntegerUnderflow tier=6 seed=\(seed) result=\(feature(seed, value))")
