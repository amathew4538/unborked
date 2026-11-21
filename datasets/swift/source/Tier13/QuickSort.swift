import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (39%64)*(39%64)
    return result + seed + value
}
let seed = 39
let value = Int(CommandLine.arguments.dropFirst().first ?? "39") ?? seed
print("feature=QuickSort tier=13 seed=\(seed) result=\(feature(seed, value))")
