import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (48%11)+40
    return result + seed + value
}
let seed = 48
let value = Int(CommandLine.arguments.dropFirst().first ?? "48") ?? seed
print("feature=Interface tier=9 seed=\(seed) result=\(feature(seed, value))")
