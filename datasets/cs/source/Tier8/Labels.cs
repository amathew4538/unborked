using System;

public class Labels {
    public static long Feature(long seed, long value) {
        long result = 64+((64%5)*7);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 64;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Labels tier=8 seed=64 result=" + Feature(64, value));
    }
}
