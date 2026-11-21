import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((94%9)+1)
    return result + seed + value
}
let seed = 94
let value = Int(CommandLine.arguments.dropFirst().first ?? "94") ?? seed
print("feature=OutOfBoundsAccess tier=15 seed=\(seed) result=\(feature(seed, value))")
