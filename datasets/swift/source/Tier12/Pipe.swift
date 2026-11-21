import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 60%1024
    return result + seed + value
}
let seed = 60
let value = Int(CommandLine.arguments.dropFirst().first ?? "60") ?? seed
print("feature=Pipe tier=12 seed=\(seed) result=\(feature(seed, value))")
