using System;

public class BitwiseAnd {
    public static long Feature(long seed, long value) {
        long result = 3*17+3;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 3;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=BitwiseAnd tier=6 seed=3 result=" + Feature(3, value));
    }
}
