using System;

public class GlobalVariables {
    public static long Feature(long seed, long value) {
        long result = 66+32;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 66;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=GlobalVariables tier=10 seed=66 result=" + Feature(66, value));
    }
}
