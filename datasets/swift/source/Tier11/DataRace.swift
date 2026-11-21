import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 1+(96%8)
    return result + seed + value
}
let seed = 96
let value = Int(CommandLine.arguments.dropFirst().first ?? "96") ?? seed
print("feature=DataRace tier=11 seed=\(seed) result=\(feature(seed, value))")
