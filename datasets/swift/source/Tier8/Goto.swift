import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 18+((18%5)*7)
    return result + seed + value
}
let seed = 18
let value = Int(CommandLine.arguments.dropFirst().first ?? "18") ?? seed
print("feature=Goto tier=8 seed=\(seed) result=\(feature(seed, value))")
