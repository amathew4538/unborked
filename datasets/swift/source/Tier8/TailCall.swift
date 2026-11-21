import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 70+((70%5)*7)
    return result + seed + value
}
let seed = 70
let value = Int(CommandLine.arguments.dropFirst().first ?? "70") ?? seed
print("feature=TailCall tier=8 seed=\(seed) result=\(feature(seed, value))")
