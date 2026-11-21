using System;

public class EarlyReturn {
    public static long Feature(long seed, long value) {
        long result = 91+((91%5)*7);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 91;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=EarlyReturn tier=8 seed=91 result=" + Feature(91, value));
    }
}
