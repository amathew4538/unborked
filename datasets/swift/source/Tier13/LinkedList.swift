import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (90%64)*(90%64)
    return result + seed + value
}
let seed = 90
let value = Int(CommandLine.arguments.dropFirst().first ?? "90") ?? seed
print("feature=LinkedList tier=13 seed=\(seed) result=\(feature(seed, value))")
