import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 91+32
    return result + seed + value
}
let seed = 91
let value = Int(CommandLine.arguments.dropFirst().first ?? "91") ?? seed
print("feature=DynamicLinking tier=10 seed=\(seed) result=\(feature(seed, value))")
