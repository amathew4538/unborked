import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 94+((94%5)*7)
    return result + seed + value
}
let seed = 94
let value = Int(CommandLine.arguments.dropFirst().first ?? "94") ?? seed
print("feature=BreakContinue tier=8 seed=\(seed) result=\(feature(seed, value))")
