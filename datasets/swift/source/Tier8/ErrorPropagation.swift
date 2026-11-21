import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 44+((44%5)*7)
    return result + seed + value
}
let seed = 44
let value = Int(CommandLine.arguments.dropFirst().first ?? "44") ?? seed
print("feature=ErrorPropagation tier=8 seed=\(seed) result=\(feature(seed, value))")
