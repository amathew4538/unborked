import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 21+32
    return result + seed + value
}
let seed = 21
let value = Int(CommandLine.arguments.dropFirst().first ?? "21") ?? seed
print("feature=ThreadLocalStorage tier=10 seed=\(seed) result=\(feature(seed, value))")
