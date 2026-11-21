using System;

public class DynamicLinking {
    public static long Feature(long seed, long value) {
        long result = 91+32;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 91;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=DynamicLinking tier=10 seed=91 result=" + Feature(91, value));
    }
}
