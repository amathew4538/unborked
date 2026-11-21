import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (57%11)+40
    return result + seed + value
}
let seed = 57
let value = Int(CommandLine.arguments.dropFirst().first ?? "57") ?? seed
print("feature=Class tier=9 seed=\(seed) result=\(feature(seed, value))")
