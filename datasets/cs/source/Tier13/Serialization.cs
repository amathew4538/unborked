using System;

public class Serialization {
    public static long Feature(long seed, long value) {
        long result = (44%64)*(44%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 44;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=Serialization tier=13 seed=44 result=" + Feature(44, value));
    }
}
