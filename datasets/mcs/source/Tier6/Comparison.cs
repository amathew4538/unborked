using System;

public class Comparison {
    public static long Feature(long seed, long value) {
        long result = 70*17+3;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 70;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Comparison tier=6 seed=70 result=" + Feature(70, value));
    }
}
