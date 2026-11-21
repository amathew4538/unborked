import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 66+32
    return result + seed + value
}
let seed = 66
let value = Int(CommandLine.arguments.dropFirst().first ?? "66") ?? seed
print("feature=GlobalVariables tier=10 seed=\(seed) result=\(feature(seed, value))")
