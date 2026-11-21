using System;

public class RadixSort {
    public static long Feature(long seed, long value) {
        long result = (74%64)*(74%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 74;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=RadixSort tier=13 seed=74 result=" + Feature(74, value));
    }
}
