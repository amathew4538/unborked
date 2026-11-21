using System;

public class Compression {
    public static long Feature(long seed, long value) {
        long result = (52%64)*(52%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 52;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Compression tier=13 seed=52 result=" + Feature(52, value));
    }
}
