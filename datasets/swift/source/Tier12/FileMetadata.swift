import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 40%1024
    return result + seed + value
}
let seed = 40
let value = Int(CommandLine.arguments.dropFirst().first ?? "40") ?? seed
print("feature=FileMetadata tier=12 seed=\(seed) result=\(feature(seed, value))")
