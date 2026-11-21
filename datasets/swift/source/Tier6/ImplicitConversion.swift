import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 28*17+3
    return result + seed + value
}
let seed = 28
let value = Int(CommandLine.arguments.dropFirst().first ?? "28") ?? seed
print("feature=ImplicitConversion tier=6 seed=\(seed) result=\(feature(seed, value))")
