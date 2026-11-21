using System;

public class RegisterArguments {
    public static long Feature(long seed, long value) {
        long result = 64+32;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 64;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=RegisterArguments tier=10 seed=64 result=" + Feature(64, value));
    }
}
