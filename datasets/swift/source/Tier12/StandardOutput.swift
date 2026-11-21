import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 23%1024
    return result + seed + value
}
let seed = 23
let value = Int(CommandLine.arguments.dropFirst().first ?? "23") ?? seed
print("feature=StandardOutput tier=12 seed=\(seed) result=\(feature(seed, value))")
