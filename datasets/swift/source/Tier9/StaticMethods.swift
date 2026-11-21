import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (30%11)+40
    return result + seed + value
}
let seed = 30
let value = Int(CommandLine.arguments.dropFirst().first ?? "30") ?? seed
print("feature=StaticMethods tier=9 seed=\(seed) result=\(feature(seed, value))")
