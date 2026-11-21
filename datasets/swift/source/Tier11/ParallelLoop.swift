import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 1+(71%8)
    return result + seed + value
}
let seed = 71
let value = Int(CommandLine.arguments.dropFirst().first ?? "71") ?? seed
print("feature=ParallelLoop tier=11 seed=\(seed) result=\(feature(seed, value))")
