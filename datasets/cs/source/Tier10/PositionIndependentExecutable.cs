using System;

public class PositionIndependentExecutable {
    public static long Feature(long seed, long value) {
        long result = 50+32;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 50;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=PositionIndependentExecutable tier=10 seed=50 result=" + Feature(50, value));
    }
}
