import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 15+32
    return result + seed + value
}
let seed = 15
let value = Int(CommandLine.arguments.dropFirst().first ?? "15") ?? seed
print("feature=SymbolVisibility tier=10 seed=\(seed) result=\(feature(seed, value))")
