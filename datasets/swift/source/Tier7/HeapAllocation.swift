import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (49%16)*4
    return result + seed + value
}
let seed = 49
let value = Int(CommandLine.arguments.dropFirst().first ?? "49") ?? seed
print("feature=HeapAllocation tier=7 seed=\(seed) result=\(feature(seed, value))")
