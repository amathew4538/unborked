using System;

public class WideningConversion {
    public static long Feature(long seed, long value) {
        long result = 59*17+3;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 59;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=WideningConversion tier=6 seed=59 result=" + Feature(59, value));
    }
}
