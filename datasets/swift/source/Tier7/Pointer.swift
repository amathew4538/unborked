import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (34%16)*4
    return result + seed + value
}
let seed = 34
let value = Int(CommandLine.arguments.dropFirst().first ?? "34") ?? seed
print("feature=Pointer tier=7 seed=\(seed) result=\(feature(seed, value))")
