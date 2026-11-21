import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (6%11)+40
    return result + seed + value
}
let seed = 6
let value = Int(CommandLine.arguments.dropFirst().first ?? "6") ?? seed
print("feature=Attributes tier=9 seed=\(seed) result=\(feature(seed, value))")
