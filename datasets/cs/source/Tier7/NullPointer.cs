using System;

public class NullPointer {
    public static long Feature(long seed, long value) {
        long result = (73%16)*4;
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 73;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=NullPointer tier=7 seed=73 result=" + Feature(73, value));
    }
}
