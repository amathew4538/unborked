import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (9%16)*4
    return result + seed + value
}
let seed = 9
let value = Int(CommandLine.arguments.dropFirst().first ?? "9") ?? seed
print("feature=Enum tier=7 seed=\(seed) result=\(feature(seed, value))")
