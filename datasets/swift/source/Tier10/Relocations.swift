import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 64+32
    return result + seed + value
}
let seed = 64
let value = Int(CommandLine.arguments.dropFirst().first ?? "64") ?? seed
print("feature=Relocations tier=10 seed=\(seed) result=\(feature(seed, value))")
