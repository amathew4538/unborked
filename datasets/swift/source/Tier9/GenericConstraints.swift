import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (76%11)+40
    return result + seed + value
}
let seed = 76
let value = Int(CommandLine.arguments.dropFirst().first ?? "76") ?? seed
print("feature=GenericConstraints tier=9 seed=\(seed) result=\(feature(seed, value))")
