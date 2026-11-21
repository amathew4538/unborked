using System;

public class KmpSearch {
    public static long Feature(long seed, long value) {
        long result = (15%64)*(15%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 15;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=KmpSearch tier=13 seed=15 result=" + Feature(15, value));
    }
}
