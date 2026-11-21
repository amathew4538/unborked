import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (92*(92+1))/2
    return result + seed + value
}
let seed = 92
let value = Int(CommandLine.arguments.dropFirst().first ?? "92") ?? seed
print("feature=Devirtualization tier=14 seed=\(seed) result=\(feature(seed, value))")
