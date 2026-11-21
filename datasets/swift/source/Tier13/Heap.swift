import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (43%64)*(43%64)
    return result + seed + value
}
let seed = 43
let value = Int(CommandLine.arguments.dropFirst().first ?? "43") ?? seed
print("feature=Heap tier=13 seed=\(seed) result=\(feature(seed, value))")
