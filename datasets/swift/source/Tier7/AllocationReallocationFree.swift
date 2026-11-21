import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (57%16)*4
    return result + seed + value
}
let seed = 57
let value = Int(CommandLine.arguments.dropFirst().first ?? "57") ?? seed
print("feature=AllocationReallocationFree tier=7 seed=\(seed) result=\(feature(seed, value))")
