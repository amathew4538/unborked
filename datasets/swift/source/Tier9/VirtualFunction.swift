import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (81%11)+40
    return result + seed + value
}
let seed = 81
let value = Int(CommandLine.arguments.dropFirst().first ?? "81") ?? seed
print("feature=VirtualFunction tier=9 seed=\(seed) result=\(feature(seed, value))")
