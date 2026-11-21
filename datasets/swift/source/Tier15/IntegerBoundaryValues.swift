import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((23%9)+1)
    return result + seed + value
}
let seed = 23
let value = Int(CommandLine.arguments.dropFirst().first ?? "23") ?? seed
print("feature=IntegerBoundaryValues tier=15 seed=\(seed) result=\(feature(seed, value))")
