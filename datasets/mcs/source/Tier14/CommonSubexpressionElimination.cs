using System;

public class CommonSubexpressionElimination {
    public static long Feature(long seed, long value) {
        long result = (52*(52+1))/2;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 52;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=CommonSubexpressionElimination tier=14 seed=52 result=" + Feature(52, value));
    }
}
