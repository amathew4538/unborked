import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (74%64)*(74%64)
    return result + seed + value
}
let seed = 74
let value = Int(CommandLine.arguments.dropFirst().first ?? "74") ?? seed
print("feature=RadixSort tier=13 seed=\(seed) result=\(feature(seed, value))")
