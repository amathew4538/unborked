using System;

public class StandardError {
    public static long Feature(long seed, long value) {
        long result = 49%1024;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 49;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=StandardError tier=12 seed=49 result=" + Feature(49, value));
    }
}
