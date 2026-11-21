import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (52%64)*(52%64)
    return result + seed + value
}
let seed = 52
let value = Int(CommandLine.arguments.dropFirst().first ?? "52") ?? seed
print("feature=Compression tier=13 seed=\(seed) result=\(feature(seed, value))")
