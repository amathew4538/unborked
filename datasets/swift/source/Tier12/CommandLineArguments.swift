import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 46%1024
    return result + seed + value
}
let seed = 46
let value = Int(CommandLine.arguments.dropFirst().first ?? "46") ?? seed
print("feature=CommandLineArguments tier=12 seed=\(seed) result=\(feature(seed, value))")
