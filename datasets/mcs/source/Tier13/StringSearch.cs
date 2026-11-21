using System;

public class StringSearch {
    public static long Feature(long seed, long value) {
        long result = (30%64)*(30%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 30;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=StringSearch tier=13 seed=30 result=" + Feature(30, value));
    }
}
