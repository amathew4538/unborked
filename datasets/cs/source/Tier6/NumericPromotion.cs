using System;

public class NumericPromotion {
    public static long Feature(long seed, long value) {
        long result = 96*17+3;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 96;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=NumericPromotion tier=6 seed=96 result=" + Feature(96, value));
    }
}
