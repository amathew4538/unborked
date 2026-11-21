import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (20%16)*4
    return result + seed + value
}
let seed = 20
let value = Int(CommandLine.arguments.dropFirst().first ?? "20") ?? seed
print("feature=PassByReference tier=7 seed=\(seed) result=\(feature(seed, value))")
