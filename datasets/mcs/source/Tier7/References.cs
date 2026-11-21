using System;

public class References {
    public static long Feature(long seed, long value) {
        long result = (68%16)*4;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 68;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=References tier=7 seed=68 result=" + Feature(68, value));
    }
}
