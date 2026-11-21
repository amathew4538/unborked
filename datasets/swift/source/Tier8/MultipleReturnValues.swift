import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 3+((3%5)*7)
    return result + seed + value
}
let seed = 3
let value = Int(CommandLine.arguments.dropFirst().first ?? "3") ?? seed
print("feature=MultipleReturnValues tier=8 seed=\(seed) result=\(feature(seed, value))")
