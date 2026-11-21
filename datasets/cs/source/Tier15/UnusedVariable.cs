using System;

public class UnusedVariable {
    public static long Feature(long seed, long value) {
        long result = 100/((66%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 66;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=UnusedVariable tier=15 seed=66 result=" + Feature(66, value));
    }
}
