import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (66*(66+1))/2
    return result + seed + value
}
let seed = 66
let value = Int(CommandLine.arguments.dropFirst().first ?? "66") ?? seed
print("feature=EscapeAnalysis tier=14 seed=\(seed) result=\(feature(seed, value))")
