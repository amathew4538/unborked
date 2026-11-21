import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((85%9)+1)
    return result + seed + value
}
let seed = 85
let value = Int(CommandLine.arguments.dropFirst().first ?? "85") ?? seed
print("feature=LargeStackFrame tier=15 seed=\(seed) result=\(feature(seed, value))")
