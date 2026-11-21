import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((17%9)+1)
    return result + seed + value
}
let seed = 17
let value = Int(CommandLine.arguments.dropFirst().first ?? "17") ?? seed
print("feature=LargeGlobalArray tier=15 seed=\(seed) result=\(feature(seed, value))")
