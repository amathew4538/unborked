using System;

public class IntegerUnderflow {
    public static long Feature(long seed, long value) {
        long result = 67*17+3;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 67;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=IntegerUnderflow tier=6 seed=67 result=" + Feature(67, value));
    }
}
