using System;

public class Slice {
    public static long Feature(long seed, long value) {
        long result = (60%16)*4;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 60;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Slice tier=7 seed=60 result=" + Feature(60, value));
    }
}
