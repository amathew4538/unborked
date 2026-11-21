import Foundation

func feature(_ seed: Int, _ value: Int) -> Int {
    let result = 100/((7%9)+1)
    return result + seed + value
}
let seed = 7
let value = Int(CommandLine.arguments.dropFirst().first ?? "7") ?? seed
print("feature=ImplementationDefinedBehavior tier=15 seed=\(seed) result=\(feature(seed, value))")
