import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 1+(0%8)
    return result + seed + value
}
let seed = 0
let value = Int(CommandLine.arguments.dropFirst().first ?? "0") ?? seed
print("feature=ThreadLocalVariables tier=11 seed=\(seed) result=\(feature(seed, value))")
