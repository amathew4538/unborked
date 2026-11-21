using System;

public class FloatingPointRounding {
    public static long Feature(long seed, long value) {
        long result = 87*17+3;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 87;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=FloatingPointRounding tier=6 seed=87 result=" + Feature(87, value));
    }
}
