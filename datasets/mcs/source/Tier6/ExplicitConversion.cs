using System;

public class ExplicitConversion {
    public static long Feature(long seed, long value) {
        long result = 46*17+3;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 46;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=ExplicitConversion tier=6 seed=46 result=" + Feature(46, value));
    }
}
