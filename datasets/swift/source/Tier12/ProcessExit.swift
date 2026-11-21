import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 11%1024
    return result + seed + value
}
let seed = 11
let value = Int(CommandLine.arguments.dropFirst().first ?? "11") ?? seed
print("feature=ProcessExit tier=12 seed=\(seed) result=\(feature(seed, value))")
