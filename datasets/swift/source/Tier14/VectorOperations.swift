import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (7*(7+1))/2
    return result + seed + value
}
let seed = 7
let value = Int(CommandLine.arguments.dropFirst().first ?? "7") ?? seed
print("feature=VectorOperations tier=14 seed=\(seed) result=\(feature(seed, value))")
