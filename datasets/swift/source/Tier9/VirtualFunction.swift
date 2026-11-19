import Foundation

func applyFeature(_ value: Int) -> Int {
    value * value + 3
}

let value = Int(CommandLine.arguments.dropFirst().first ?? "42") ?? 42
print("feature=VirtualFunction value=\(value) result=\(applyFeature(value))")
