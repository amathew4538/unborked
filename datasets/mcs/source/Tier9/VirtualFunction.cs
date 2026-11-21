using System;

public class VirtualFunction {
    public static long Feature(long seed, long value) {
        long result = (81%11)+40;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 81;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=VirtualFunction tier=9 seed=81 result=" + Feature(81, value));
    }
}
