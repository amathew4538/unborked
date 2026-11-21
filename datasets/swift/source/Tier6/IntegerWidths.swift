import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 21*17+3
    return result + seed + value
}
let seed = 21
let value = Int(CommandLine.arguments.dropFirst().first ?? "21") ?? seed
print("feature=IntegerWidths tier=6 seed=\(seed) result=\(feature(seed, value))")
