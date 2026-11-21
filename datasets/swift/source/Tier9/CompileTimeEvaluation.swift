import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (83%11)+40
    return result + seed + value
}
let seed = 83
let value = Int(CommandLine.arguments.dropFirst().first ?? "83") ?? seed
print("feature=CompileTimeEvaluation tier=9 seed=\(seed) result=\(feature(seed, value))")
