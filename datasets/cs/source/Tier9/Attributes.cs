using System;

public class Attributes {
    public static long Feature(long seed, long value) {
        long result = (6%11)+40;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 6;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Attributes tier=9 seed=6 result=" + Feature(6, value));
    }
}
