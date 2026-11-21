import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 87*17+3
    return result + seed + value
}
let seed = 87
let value = Int(CommandLine.arguments.dropFirst().first ?? "87") ?? seed
print("feature=FloatingPointRounding tier=6 seed=\(seed) result=\(feature(seed, value))")
