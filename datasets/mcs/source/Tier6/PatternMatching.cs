using System;

public class PatternMatching {
    public static long Feature(long seed, long value) {
        long result = 65*17+3;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 65;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=PatternMatching tier=6 seed=65 result=" + Feature(65, value));
    }
}
