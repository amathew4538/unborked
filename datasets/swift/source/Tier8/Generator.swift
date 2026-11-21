import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 35+((35%5)*7)
    return result + seed + value
}
let seed = 35
let value = Int(CommandLine.arguments.dropFirst().first ?? "35") ?? seed
print("feature=Generator tier=8 seed=\(seed) result=\(feature(seed, value))")
