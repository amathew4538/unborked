import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 91+((91%5)*7)
    return result + seed + value
}
let seed = 91
let value = Int(CommandLine.arguments.dropFirst().first ?? "91") ?? seed
print("feature=EarlyReturn tier=8 seed=\(seed) result=\(feature(seed, value))")
