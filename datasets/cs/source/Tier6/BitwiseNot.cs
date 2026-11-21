using System;

public class BitwiseNot {
    public static long Feature(long seed, long value) {
        long result = 82*17+3;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 82;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=BitwiseNot tier=6 seed=82 result=" + Feature(82, value));
    }
}
