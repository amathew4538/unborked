using System;

public class StandardInput {
    public static long Feature(long seed, long value) {
        long result = 24%1024;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 24;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=StandardInput tier=12 seed=24 result=" + Feature(24, value));
    }
}
