import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 45+((45%5)*7)
    return result + seed + value
}
let seed = 45
let value = Int(CommandLine.arguments.dropFirst().first ?? "45") ?? seed
print("feature=Closure tier=8 seed=\(seed) result=\(feature(seed, value))")
