import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 1+(57%8)
    return result + seed + value
}
let seed = 57
let value = Int(CommandLine.arguments.dropFirst().first ?? "57") ?? seed
print("feature=AtomicStore tier=11 seed=\(seed) result=\(feature(seed, value))")
