using System;

public class NarrowingConversion {
    public static long Feature(long seed, long value) {
        long result = 93*17+3;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 93;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=NarrowingConversion tier=6 seed=93 result=" + Feature(93, value));
    }
}
