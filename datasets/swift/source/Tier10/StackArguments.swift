import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 86+32
    return result + seed + value
}
let seed = 86
let value = Int(CommandLine.arguments.dropFirst().first ?? "86") ?? seed
print("feature=StackArguments tier=10 seed=\(seed) result=\(feature(seed, value))")
