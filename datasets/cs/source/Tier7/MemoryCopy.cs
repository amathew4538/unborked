using System;

public class MemoryCopy {
    public static long Feature(long seed, long value) {
        long result = (4%16)*4;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 4;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=MemoryCopy tier=7 seed=4 result=" + Feature(4, value));
    }
}
