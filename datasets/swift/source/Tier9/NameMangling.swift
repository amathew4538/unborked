import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (78%11)+40
    return result + seed + value
}
let seed = 78
let value = Int(CommandLine.arguments.dropFirst().first ?? "78") ?? seed
print("feature=NameMangling tier=9 seed=\(seed) result=\(feature(seed, value))")
