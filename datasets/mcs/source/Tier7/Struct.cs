using System;

public class Struct {
    public static long Feature(long seed, long value) {
        long result = (85%16)*4;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 85;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Struct tier=7 seed=85 result=" + Feature(85, value));
    }
}
