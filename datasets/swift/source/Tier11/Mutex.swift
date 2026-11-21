import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 1+(14%8)
    return result + seed + value
}
let seed = 14
let value = Int(CommandLine.arguments.dropFirst().first ?? "14") ?? seed
print("feature=Mutex tier=11 seed=\(seed) result=\(feature(seed, value))")
