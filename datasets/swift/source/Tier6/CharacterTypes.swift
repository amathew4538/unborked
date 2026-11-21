import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 30*17+3
    return result + seed + value
}
let seed = 30
let value = Int(CommandLine.arguments.dropFirst().first ?? "30") ?? seed
print("feature=CharacterTypes tier=6 seed=\(seed) result=\(feature(seed, value))")
