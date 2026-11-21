import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (52%11)+40
    return result + seed + value
}
let seed = 52
let value = Int(CommandLine.arguments.dropFirst().first ?? "52") ?? seed
print("feature=Reflection tier=9 seed=\(seed) result=\(feature(seed, value))")
