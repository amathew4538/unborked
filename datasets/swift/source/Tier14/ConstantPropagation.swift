import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (75*(75+1))/2
    return result + seed + value
}
let seed = 75
let value = Int(CommandLine.arguments.dropFirst().first ?? "75") ?? seed
print("feature=ConstantPropagation tier=14 seed=\(seed) result=\(feature(seed, value))")
