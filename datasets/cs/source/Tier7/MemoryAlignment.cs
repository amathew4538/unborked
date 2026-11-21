using System;

public class MemoryAlignment {
    public static long Feature(long seed, long value) {
        long result = (44%16)*4;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 44;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=MemoryAlignment tier=7 seed=44 result=" + Feature(44, value));
    }
}
