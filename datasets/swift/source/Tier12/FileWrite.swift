import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 43%1024
    return result + seed + value
}
let seed = 43
let value = Int(CommandLine.arguments.dropFirst().first ?? "43") ?? seed
print("feature=FileWrite tier=12 seed=\(seed) result=\(feature(seed, value))")
