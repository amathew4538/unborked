import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (5*(5+1))/2
    return result + seed + value
}
let seed = 5
let value = Int(CommandLine.arguments.dropFirst().first ?? "5") ?? seed
print("feature=BranchElimination tier=14 seed=\(seed) result=\(feature(seed, value))")
