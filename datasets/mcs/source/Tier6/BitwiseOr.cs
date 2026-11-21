using System;

public class BitwiseOr {
    public static long Feature(long seed, long value) {
        long result = 24*17+3;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 24;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=BitwiseOr tier=6 seed=24 result=" + Feature(24, value));
    }
}
