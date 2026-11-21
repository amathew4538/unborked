using System;

public class Exception {
    public static long Feature(long seed, long value) {
        long result = 29+((29%5)*7);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 29;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Exception tier=8 seed=29 result=" + Feature(29, value));
    }
}
