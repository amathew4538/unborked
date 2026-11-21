using System;

public class Heap {
    public static long Feature(long seed, long value) {
        long result = (43%64)*(43%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 43;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Heap tier=13 seed=43 result=" + Feature(43, value));
    }
}
