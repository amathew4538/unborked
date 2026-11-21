import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 1+(87%8)
    return result + seed + value
}
let seed = 87
let value = Int(CommandLine.arguments.dropFirst().first ?? "87") ?? seed
print("feature=RecursiveMutex tier=11 seed=\(seed) result=\(feature(seed, value))")
