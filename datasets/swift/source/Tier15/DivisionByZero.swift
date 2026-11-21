import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((92%9)+1)
    return result + seed + value
}
let seed = 92
let value = Int(CommandLine.arguments.dropFirst().first ?? "92") ?? seed
print("feature=DivisionByZero tier=15 seed=\(seed) result=\(feature(seed, value))")
