using System;

public class HashSet {
    public static long Feature(long seed, long value) {
        long result = (47%64)*(47%64);
        return result + seed + value;
    }

    public static void Main(string[] args) {
        long value = 47;
        if (args.Length > 0) { long.TryParse(args[0], out value); }
        Console.WriteLine("feature=HashSet tier=13 seed=47 result=" + Feature(47, value));
    }
}
