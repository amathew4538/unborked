using System;

public class IntegerBoundaryValues {
    public static long Feature(long seed, long value) {
        long result = 100/((23%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 23;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=IntegerBoundaryValues tier=15 seed=23 result=" + Feature(23, value));
    }
}
