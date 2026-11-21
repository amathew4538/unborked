import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 1+(72%8)
    return result + seed + value
}
let seed = 72
let value = Int(CommandLine.arguments.dropFirst().first ?? "72") ?? seed
print("feature=AtomicAdd tier=11 seed=\(seed) result=\(feature(seed, value))")
