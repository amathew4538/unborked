using System;

public class ReturnValueConvention {
    public static long Feature(long seed, long value) {
        long result = 76+32;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 76;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=ReturnValueConvention tier=10 seed=76 result=" + Feature(76, value));
    }
}
