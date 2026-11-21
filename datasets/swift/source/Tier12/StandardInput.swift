import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 24%1024
    return result + seed + value
}
let seed = 24
let value = Int(CommandLine.arguments.dropFirst().first ?? "24") ?? seed
print("feature=StandardInput tier=12 seed=\(seed) result=\(feature(seed, value))")
