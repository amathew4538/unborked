using System;

public class TypeInference {
    public static long Feature(long seed, long value) {
        long result = 48*17+3;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 48;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=TypeInference tier=6 seed=48 result=" + Feature(48, value));
    }
}
