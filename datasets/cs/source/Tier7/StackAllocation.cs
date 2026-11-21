using System;

public class StackAllocation {
    public static long Feature(long seed, long value) {
        long result = (51%16)*4;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 51;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=StackAllocation tier=7 seed=51 result=" + Feature(51, value));
    }
}
