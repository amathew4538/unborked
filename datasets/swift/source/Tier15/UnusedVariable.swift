import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((66%9)+1)
    return result + seed + value
}
let seed = 66
let value = Int(CommandLine.arguments.dropFirst().first ?? "66") ?? seed
print("feature=UnusedVariable tier=15 seed=\(seed) result=\(feature(seed, value))")
