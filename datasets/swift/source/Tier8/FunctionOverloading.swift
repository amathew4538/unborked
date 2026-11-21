import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 20+((20%5)*7)
    return result + seed + value
}
let seed = 20
let value = Int(CommandLine.arguments.dropFirst().first ?? "20") ?? seed
print("feature=FunctionOverloading tier=8 seed=\(seed) result=\(feature(seed, value))")
