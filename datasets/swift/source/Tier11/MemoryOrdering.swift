import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 1+(49%8)
    return result + seed + value
}
let seed = 49
let value = Int(CommandLine.arguments.dropFirst().first ?? "49") ?? seed
print("feature=MemoryOrdering tier=11 seed=\(seed) result=\(feature(seed, value))")
