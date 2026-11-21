import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 1+(29%8)
    return result + seed + value
}
let seed = 29
let value = Int(CommandLine.arguments.dropFirst().first ?? "29") ?? seed
print("feature=Semaphore tier=11 seed=\(seed) result=\(feature(seed, value))")
