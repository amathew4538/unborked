import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (68%16)*4
    return result + seed + value
}
let seed = 68
let value = Int(CommandLine.arguments.dropFirst().first ?? "68") ?? seed
print("feature=References tier=7 seed=\(seed) result=\(feature(seed, value))")
