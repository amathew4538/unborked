import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 38+32
    return result + seed + value
}
let seed = 38
let value = Int(CommandLine.arguments.dropFirst().first ?? "38") ?? seed
print("feature=SymbolMangling tier=10 seed=\(seed) result=\(feature(seed, value))")
