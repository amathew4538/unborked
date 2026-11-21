using System;

public class VolatileAccess {
    public static long Feature(long seed, long value) {
        long result = (8%16)*4;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 8;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=VolatileAccess tier=7 seed=8 result=" + Feature(8, value));
    }
}
