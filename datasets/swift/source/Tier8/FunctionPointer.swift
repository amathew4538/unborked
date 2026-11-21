import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 30+((30%5)*7)
    return result + seed + value
}
let seed = 30
let value = Int(CommandLine.arguments.dropFirst().first ?? "30") ?? seed
print("feature=FunctionPointer tier=8 seed=\(seed) result=\(feature(seed, value))")
