import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 34+((34%5)*7)
    return result + seed + value
}
let seed = 34
let value = Int(CommandLine.arguments.dropFirst().first ?? "34") ?? seed
print("feature=Lambda tier=8 seed=\(seed) result=\(feature(seed, value))")
