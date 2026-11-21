import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (47*(47+1))/2
    return result + seed + value
}
let seed = 47
let value = Int(CommandLine.arguments.dropFirst().first ?? "47") ?? seed
print("feature=BoundsCheckElimination tier=14 seed=\(seed) result=\(feature(seed, value))")
