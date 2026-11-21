using System;

public class AllocationReallocationFree {
    public static long Feature(long seed, long value) {
        long result = (57%16)*4;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 57;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=AllocationReallocationFree tier=7 seed=57 result=" + Feature(57, value));
    }
}
