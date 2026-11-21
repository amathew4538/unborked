import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 27*17+3
    return result + seed + value
}
let seed = 27
let value = Int(CommandLine.arguments.dropFirst().first ?? "27") ?? seed
print("feature=Constants tier=6 seed=\(seed) result=\(feature(seed, value))")
