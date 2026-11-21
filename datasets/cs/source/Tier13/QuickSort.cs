using System;

public class QuickSort {
    public static long Feature(long seed, long value) {
        long result = (39%64)*(39%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 39;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=QuickSort tier=13 seed=39 result=" + Feature(39, value));
    }
}
