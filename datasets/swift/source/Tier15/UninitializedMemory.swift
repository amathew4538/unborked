import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((67%9)+1)
    return result + seed + value
}
let seed = 67
let value = Int(CommandLine.arguments.dropFirst().first ?? "67") ?? seed
print("feature=UninitializedMemory tier=15 seed=\(seed) result=\(feature(seed, value))")
