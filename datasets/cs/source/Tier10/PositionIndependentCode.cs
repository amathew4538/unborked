using System;

public class PositionIndependentCode {
    public static long Feature(long seed, long value) {
        long result = 88+32;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 88;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=PositionIndependentCode tier=10 seed=88 result=" + Feature(88, value));
    }
}
