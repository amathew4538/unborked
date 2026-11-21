import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 2+((2%5)*7)
    return result + seed + value
}
let seed = 2
let value = Int(CommandLine.arguments.dropFirst().first ?? "2") ?? seed
print("feature=ClosureCapture tier=8 seed=\(seed) result=\(feature(seed, value))")
