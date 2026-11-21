import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 90+32
    return result + seed + value
}
let seed = 90
let value = Int(CommandLine.arguments.dropFirst().first ?? "90") ?? seed
print("feature=StackFrame tier=10 seed=\(seed) result=\(feature(seed, value))")
