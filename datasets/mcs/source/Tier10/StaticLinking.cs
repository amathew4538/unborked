using System;

public class StaticLinking {
    public static long Feature(long seed, long value) {
        long result = 26+32;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 26;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=StaticLinking tier=10 seed=26 result=" + Feature(26, value));
    }
}
