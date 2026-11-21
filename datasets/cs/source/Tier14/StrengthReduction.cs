using System;

public class StrengthReduction {
    public static long Feature(long seed, long value) {
        long result = (58*(58+1))/2;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 58;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=StrengthReduction tier=14 seed=58 result=" + Feature(58, value));
    }
}
