import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = (86%64)*(86%64)
    return result + seed + value
}
let seed = 86
let value = Int(CommandLine.arguments.dropFirst().first ?? "86") ?? seed
print("feature=Dijkstra tier=13 seed=\(seed) result=\(feature(seed, value))")
