import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (37*(37+1))/2
    return result + seed + value
}
let seed = 37
let value = Int(CommandLine.arguments.dropFirst().first ?? "37") ?? seed
print("feature=RegisterSpilling tier=14 seed=\(seed) result=\(feature(seed, value))")
