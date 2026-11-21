import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (13*(13+1))/2
    return result + seed + value
}
let seed = 13
let value = Int(CommandLine.arguments.dropFirst().first ?? "13") ?? seed
print("feature=LoopVectorization tier=14 seed=\(seed) result=\(feature(seed, value))")
