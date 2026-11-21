using System;

public class ProcessExit {
    public static long Feature(long seed, long value) {
        long result = 11%1024;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 11;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=ProcessExit tier=12 seed=11 result=" + Feature(11, value));
    }
}
