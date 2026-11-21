import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 93+((93%5)*7)
    return result + seed + value
}
let seed = 93
let value = Int(CommandLine.arguments.dropFirst().first ?? "93") ?? seed
print("feature=VariadicFunction tier=8 seed=\(seed) result=\(feature(seed, value))")
