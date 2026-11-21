using System;

public class Interface {
    public static long Feature(long seed, long value) {
        long result = (48%11)+40;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 48;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Interface tier=9 seed=48 result=" + Feature(48, value));
    }
}
