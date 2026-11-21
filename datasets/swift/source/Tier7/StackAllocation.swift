import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (51%16)*4
    return result + seed + value
}
let seed = 51
let value = Int(CommandLine.arguments.dropFirst().first ?? "51") ?? seed
print("feature=StackAllocation tier=7 seed=\(seed) result=\(feature(seed, value))")
