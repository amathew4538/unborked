using System;

public class SymbolVisibility {
    public static long Feature(long seed, long value) {
        long result = 15+32;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 15;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=SymbolVisibility tier=10 seed=15 result=" + Feature(15, value));
    }
}
