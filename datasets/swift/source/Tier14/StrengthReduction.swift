import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (58*(58+1))/2
    return result + seed + value
}
let seed = 58
let value = Int(CommandLine.arguments.dropFirst().first ?? "58") ?? seed
print("feature=StrengthReduction tier=14 seed=\(seed) result=\(feature(seed, value))")
