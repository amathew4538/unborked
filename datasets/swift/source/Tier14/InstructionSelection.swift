import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (41*(41+1))/2
    return result + seed + value
}
let seed = 41
let value = Int(CommandLine.arguments.dropFirst().first ?? "41") ?? seed
print("feature=InstructionSelection tier=14 seed=\(seed) result=\(feature(seed, value))")
