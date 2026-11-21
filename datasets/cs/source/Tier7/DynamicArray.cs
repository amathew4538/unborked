using System;

public class DynamicArray {
    public static long Feature(long seed, long value) {
        long result = (50%16)*4;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 50;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=DynamicArray tier=7 seed=50 result=" + Feature(50, value));
    }
}
