import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (10%64)*(10%64)
    return result + seed + value
}
let seed = 10
let value = Int(CommandLine.arguments.dropFirst().first ?? "10") ?? seed
print("feature=Checksum tier=13 seed=\(seed) result=\(feature(seed, value))")
