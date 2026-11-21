using System;

public class AtomicCompareExchange {
    public static long Feature(long seed, long value) {
        long result = 1+(52%8);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 52;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=AtomicCompareExchange tier=11 seed=52 result=" + Feature(52, value));
    }
}
