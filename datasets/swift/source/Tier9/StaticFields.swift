import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (34%11)+40
    return result + seed + value
}
let seed = 34
let value = Int(CommandLine.arguments.dropFirst().first ?? "34") ?? seed
print("feature=StaticFields tier=9 seed=\(seed) result=\(feature(seed, value))")
