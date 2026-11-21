import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((36%9)+1)
    return result + seed + value
}
let seed = 36
let value = Int(CommandLine.arguments.dropFirst().first ?? "36") ?? seed
print("feature=UseAfterFree tier=15 seed=\(seed) result=\(feature(seed, value))")
