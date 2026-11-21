import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (85%16)*4
    return result + seed + value
}
let seed = 85
let value = Int(CommandLine.arguments.dropFirst().first ?? "85") ?? seed
print("feature=Struct tier=7 seed=\(seed) result=\(feature(seed, value))")
