import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (84%16)*4
    return result + seed + value
}
let seed = 84
let value = Int(CommandLine.arguments.dropFirst().first ?? "84") ?? seed
print("feature=MemoryPadding tier=7 seed=\(seed) result=\(feature(seed, value))")
