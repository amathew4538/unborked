import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (1%11)+40
    return result + seed + value
}
let seed = 1
let value = Int(CommandLine.arguments.dropFirst().first ?? "1") ?? seed
print("feature=Inheritance tier=9 seed=\(seed) result=\(feature(seed, value))")
