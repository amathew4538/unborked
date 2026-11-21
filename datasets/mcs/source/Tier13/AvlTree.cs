using System;

public class AvlTree {
    public static long Feature(long seed, long value) {
        long result = (31%64)*(31%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 31;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=AvlTree tier=13 seed=31 result=" + Feature(31, value));
    }
}
