import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (37%64)*(37%64)
    return result + seed + value
}
let seed = 37
let value = Int(CommandLine.arguments.dropFirst().first ?? "37") ?? seed
print("feature=HeapSort tier=13 seed=\(seed) result=\(feature(seed, value))")
