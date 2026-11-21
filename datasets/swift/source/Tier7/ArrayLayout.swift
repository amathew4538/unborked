import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (95%16)*4
    return result + seed + value
}
let seed = 95
let value = Int(CommandLine.arguments.dropFirst().first ?? "95") ?? seed
print("feature=ArrayLayout tier=7 seed=\(seed) result=\(feature(seed, value))")
