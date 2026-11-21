using System;

public class UnreachableCode {
    public static long Feature(long seed, long value) {
        long result = 100/((35%9)+1);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 35;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=UnreachableCode tier=15 seed=35 result=" + Feature(35, value));
    }
}
