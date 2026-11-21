using System;

public class MemoryMove {
    public static long Feature(long seed, long value) {
        long result = (25%16)*4;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 25;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=MemoryMove tier=7 seed=25 result=" + Feature(25, value));
    }
}
