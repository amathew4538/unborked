import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((28%9)+1)
    return result + seed + value
}
let seed = 28
let value = Int(CommandLine.arguments.dropFirst().first ?? "28") ?? seed
print("feature=ConstantExpression tier=15 seed=\(seed) result=\(feature(seed, value))")
