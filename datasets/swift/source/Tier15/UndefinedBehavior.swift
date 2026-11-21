import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((37%9)+1)
    return result + seed + value
}
let seed = 37
let value = Int(CommandLine.arguments.dropFirst().first ?? "37") ?? seed
print("feature=UndefinedBehavior tier=15 seed=\(seed) result=\(feature(seed, value))")
