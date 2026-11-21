import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (16*(16+1))/2
    return result + seed + value
}
let seed = 16
let value = Int(CommandLine.arguments.dropFirst().first ?? "16") ?? seed
print("feature=LoopUnrolling tier=14 seed=\(seed) result=\(feature(seed, value))")
