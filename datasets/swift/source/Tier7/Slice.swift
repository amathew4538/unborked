import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (60%16)*4
    return result + seed + value
}
let seed = 60
let value = Int(CommandLine.arguments.dropFirst().first ?? "60") ?? seed
print("feature=Slice tier=7 seed=\(seed) result=\(feature(seed, value))")
