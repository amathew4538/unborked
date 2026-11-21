using System;

public class DynamicInitialization {
    public static long Feature(long seed, long value) {
        long result = 77+32;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 77;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=DynamicInitialization tier=10 seed=77 result=" + Feature(77, value));
    }
}
