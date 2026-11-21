import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 39+32
    return result + seed + value
}
let seed = 39
let value = Int(CommandLine.arguments.dropFirst().first ?? "39") ?? seed
print("feature=SharedLibrary tier=10 seed=\(seed) result=\(feature(seed, value))")
