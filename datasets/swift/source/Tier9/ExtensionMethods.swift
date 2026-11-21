import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (77%11)+40
    return result + seed + value
}
let seed = 77
let value = Int(CommandLine.arguments.dropFirst().first ?? "77") ?? seed
print("feature=ExtensionMethods tier=9 seed=\(seed) result=\(feature(seed, value))")
