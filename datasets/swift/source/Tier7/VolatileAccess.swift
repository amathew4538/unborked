import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (8%16)*4
    return result + seed + value
}
let seed = 8
let value = Int(CommandLine.arguments.dropFirst().first ?? "8") ?? seed
print("feature=VolatileAccess tier=7 seed=\(seed) result=\(feature(seed, value))")
