using System;

public class SignedUnsigned {
    public static long Feature(long seed, long value) {
        long result = 9*17+3;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 9;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=SignedUnsigned tier=6 seed=9 result=" + Feature(9, value));
    }
}
