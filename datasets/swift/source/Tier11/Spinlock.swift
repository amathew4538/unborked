import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 1+(34%8)
    return result + seed + value
}
let seed = 34
let value = Int(CommandLine.arguments.dropFirst().first ?? "34") ?? seed
print("feature=Spinlock tier=11 seed=\(seed) result=\(feature(seed, value))")
