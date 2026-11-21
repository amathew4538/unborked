import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (44%64)*(44%64)
    return result + seed + value
}
let seed = 44
let value = Int(CommandLine.arguments.dropFirst().first ?? "44") ?? seed
print("feature=Serialization tier=13 seed=\(seed) result=\(feature(seed, value))")
