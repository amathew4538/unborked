using System;

public class IntegerOverflow {
    public static long Feature(long seed, long value) {
        long result = 85*17+3;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 85;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=IntegerOverflow tier=6 seed=85 result=" + Feature(85, value));
    }
}
