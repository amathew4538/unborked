import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (93%11)+40
    return result + seed + value
}
let seed = 93
let value = Int(CommandLine.arguments.dropFirst().first ?? "93") ?? seed
print("feature=RuntimeTypeInformation tier=9 seed=\(seed) result=\(feature(seed, value))")
