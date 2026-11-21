using System;

public class HeapSort {
    public static long Feature(long seed, long value) {
        long result = (37%64)*(37%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 37;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=HeapSort tier=13 seed=37 result=" + Feature(37, value));
    }
}
