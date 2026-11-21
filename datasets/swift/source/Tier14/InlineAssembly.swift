import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (28*(28+1))/2
    return result + seed + value
}
let seed = 28
let value = Int(CommandLine.arguments.dropFirst().first ?? "28") ?? seed
print("feature=InlineAssembly tier=14 seed=\(seed) result=\(feature(seed, value))")
