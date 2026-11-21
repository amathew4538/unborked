import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 37+32
    return result + seed + value
}
let seed = 37
let value = Int(CommandLine.arguments.dropFirst().first ?? "37") ?? seed
print("feature=ExceptionUnwinding tier=10 seed=\(seed) result=\(feature(seed, value))")
