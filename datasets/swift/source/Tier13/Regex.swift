import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (45%64)*(45%64)
    return result + seed + value
}
let seed = 45
let value = Int(CommandLine.arguments.dropFirst().first ?? "45") ?? seed
print("feature=Regex tier=13 seed=\(seed) result=\(feature(seed, value))")
