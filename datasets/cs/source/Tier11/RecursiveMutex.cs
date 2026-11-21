using System;

public class RecursiveMutex {
    public static long Feature(long seed, long value) {
        long result = 1+(87%8);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 87;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=RecursiveMutex tier=11 seed=87 result=" + Feature(87, value));
    }
}
