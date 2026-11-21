using System;

public class DefaultArguments {
    public static long Feature(long seed, long value) {
        long result = 63+((63%5)*7);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 63;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=DefaultArguments tier=8 seed=63 result=" + Feature(63, value));
    }
}
