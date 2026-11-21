import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 1+(42%8)
    return result + seed + value
}
let seed = 42
let value = Int(CommandLine.arguments.dropFirst().first ?? "42") ?? seed
print("feature=MemoryFence tier=11 seed=\(seed) result=\(feature(seed, value))")
