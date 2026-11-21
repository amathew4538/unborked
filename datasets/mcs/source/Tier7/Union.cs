using System;

public class Union {
    public static long Feature(long seed, long value) {
        long result = (62%16)*4;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 62;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Union tier=7 seed=62 result=" + Feature(62, value));
    }
}
