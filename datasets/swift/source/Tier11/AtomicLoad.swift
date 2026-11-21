import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 1+(46%8)
    return result + seed + value
}
let seed = 46
let value = Int(CommandLine.arguments.dropFirst().first ?? "46") ?? seed
print("feature=AtomicLoad tier=11 seed=\(seed) result=\(feature(seed, value))")
