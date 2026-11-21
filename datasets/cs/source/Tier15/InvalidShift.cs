using System;

public class InvalidShift {
    public static long Feature(long seed, long value) {
        long result = 100/((18%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 18;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=InvalidShift tier=15 seed=18 result=" + Feature(18, value));
    }
}
