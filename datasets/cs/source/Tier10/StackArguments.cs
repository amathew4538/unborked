using System;

public class StackArguments {
    public static long Feature(long seed, long value) {
        long result = 86+32;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 86;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=StackArguments tier=10 seed=86 result=" + Feature(86, value));
    }
}
