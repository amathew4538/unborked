import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 63%1024
    return result + seed + value
}
let seed = 63
let value = Int(CommandLine.arguments.dropFirst().first ?? "63") ?? seed
print("feature=ProcessSpawn tier=12 seed=\(seed) result=\(feature(seed, value))")
