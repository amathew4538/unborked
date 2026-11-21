import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 1+(45%8)
    return result + seed + value
}
let seed = 45
let value = Int(CommandLine.arguments.dropFirst().first ?? "45") ?? seed
print("feature=ThreadJoin tier=11 seed=\(seed) result=\(feature(seed, value))")
