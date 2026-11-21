import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((62%9)+1)
    return result + seed + value
}
let seed = 62
let value = Int(CommandLine.arguments.dropFirst().first ?? "62") ?? seed
print("feature=UnspecifiedBehavior tier=15 seed=\(seed) result=\(feature(seed, value))")
