import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (15%64)*(15%64)
    return result + seed + value
}
let seed = 15
let value = Int(CommandLine.arguments.dropFirst().first ?? "15") ?? seed
print("feature=KmpSearch tier=13 seed=\(seed) result=\(feature(seed, value))")
