import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (75%11)+40
    return result + seed + value
}
let seed = 75
let value = Int(CommandLine.arguments.dropFirst().first ?? "75") ?? seed
print("feature=InstanceFields tier=9 seed=\(seed) result=\(feature(seed, value))")
