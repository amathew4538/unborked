import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 1+(52%8)
    return result + seed + value
}
let seed = 52
let value = Int(CommandLine.arguments.dropFirst().first ?? "52") ?? seed
print("feature=AtomicCompareExchange tier=11 seed=\(seed) result=\(feature(seed, value))")
