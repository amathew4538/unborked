import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((18%9)+1)
    return result + seed + value
}
let seed = 18
let value = Int(CommandLine.arguments.dropFirst().first ?? "18") ?? seed
print("feature=InvalidShift tier=15 seed=\(seed) result=\(feature(seed, value))")
