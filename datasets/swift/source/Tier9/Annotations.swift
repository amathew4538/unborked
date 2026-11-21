import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (59%11)+40
    return result + seed + value
}
let seed = 59
let value = Int(CommandLine.arguments.dropFirst().first ?? "59") ?? seed
print("feature=Annotations tier=9 seed=\(seed) result=\(feature(seed, value))")
