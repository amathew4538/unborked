using System;

public class FloatingPointBoundaryValues {
    public static long Feature(long seed, long value) {
        long result = 100/((20%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 20;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=FloatingPointBoundaryValues tier=15 seed=20 result=" + Feature(20, value));
    }
}
