import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (32*(32+1))/2
    return result + seed + value
}
let seed = 32
let value = Int(CommandLine.arguments.dropFirst().first ?? "32") ?? seed
print("feature=DeadCodeElimination tier=14 seed=\(seed) result=\(feature(seed, value))")
